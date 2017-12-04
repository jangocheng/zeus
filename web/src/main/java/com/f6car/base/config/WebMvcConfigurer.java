/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;


import com.air.tqb.realm.KissoShiroInterceptor;
import com.air.tqb.realm.LoginCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.baomidou.kisso.web.interceptor.SSOSpringInterceptor;
import com.f6car.base.common.Result;
import com.f6car.base.common.ResultCode;
import com.f6car.base.constant.Constants;
import com.f6car.base.exception.ServiceException;
import com.f6car.base.web.converter.ExcelHttpMessageConverter;
import com.f6car.base.web.interceptor.CleanInterceptor;
import com.f6car.base.web.json.BigIntegerValueFilter;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.f6car.base.web.converter.ExcelHttpMessageConverter.EXCEL_MEDIA_TYPE;

/**
 * @author qixiaobo
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {


    private final Logger logger = LoggerFactory.getLogger(WebMvcConfigurer.class);


    @Autowired(required = false)
    private List<LoginCallback> callbackList = new ArrayList<>();

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        List<ResourceHandler> resourceHandlerList = resourceHandlerConfig().getResourceHandlerList();
        for (ResourceHandler resourceHandler : resourceHandlerList) {
            registry.addResourceHandler(resourceHandler.getPattern())
                    .addResourceLocations(resourceHandler.getLocation());
        }

    }

    @Bean
    public ResourceHandlerConfig resourceHandlerConfig() {
        return new ResourceHandlerConfig();
    }

    //统一异常处理
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new HandlerExceptionResolver() {
            @Override
            public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
                Result result = new Result();
                if (e instanceof ServiceException) {
                    result.setCode(ResultCode.FAIL).setMessage(e.getMessage());
                    logger.info(e.getMessage());
                } else if (e instanceof NoHandlerFoundException) {
                    result.setCode(ResultCode.NOT_FOUND).setMessage("接口 [" + request.getRequestURI() + "] 不存在");
                } else if (e instanceof ServletException) {
                    result.setCode(ResultCode.FAIL).setMessage(e.getMessage());
                } else if (e instanceof AuthorizationException) {
                    result.setCode(ResultCode.FORBIDDEN).setMessage(e.getMessage());
                } else if (e instanceof AuthenticationException) {
                    result.setCode(ResultCode.UNAUTHORIZED).setMessage(e.getMessage());
                } else {
                    result.setCode(ResultCode.INTERNAL_SERVER_ERROR).setMessage("接口 [" + request.getRequestURI() + "] 内部错误，请联系管理员");
                    String message;
                    if (handler instanceof HandlerMethod) {
                        HandlerMethod handlerMethod = (HandlerMethod) handler;
                        message = String.format("接口 [%s] 出现异常，方法：%s.%s，异常摘要：%s",
                                request.getRequestURI(),
                                handlerMethod.getBean().getClass().getName(),
                                handlerMethod.getMethod().getName(),
                                e.getMessage());
                    } else {
                        message = e.getMessage();
                    }
                    logger.error(message, e);
                }
                responseResult(response, result);
                return new ModelAndView();
            }

        });
    }

    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ssoInterceptor = registry.addInterceptor(new SSOSpringInterceptor());
        interceptorRegistrationExcluedStaticCallback(ssoInterceptor);
        KissoShiroInterceptor kissoShiroInterceptor = new KissoShiroInterceptor();
        kissoShiroInterceptor.setLoginCallbackList(callbackList);
        InterceptorRegistration kissoInterceptor = registry.addInterceptor(kissoShiroInterceptor);
        interceptorRegistrationExcluedStaticCallback(kissoInterceptor);
        InterceptorRegistration cleanInterceptor = registry.addInterceptor(new CleanInterceptor());
        interceptorRegistrationExcluedStaticCallback(cleanInterceptor);

    }

    private void interceptorRegistrationExcluedStaticCallback(InterceptorRegistration interceptorRegistration) {
        List<ResourceHandler> resourceHandlerList = resourceHandlerConfig().getResourceHandlerList();
        for (ResourceHandler resourceHandler : resourceHandlerList) {
            interceptorRegistration.excludePathPatterns(resourceHandler.getPattern());
        }
        interceptorRegistration.excludePathPatterns("/webjars/**", "/swagger-ui.html", "/error");
    }

    private void responseResult(HttpServletResponse response, Result result) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setStatus(200);
        try {
            response.getWriter().write(JSON.toJSONString(result));
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        }
    }


    static final Splitter COMMA_SPLITTER = Splitter.on(Constants.COMMA);

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(createExcelHttpMessageConverter());
        converters.add(createFastJsonHttpMessageConverter());
    }

    private FastJsonHttpMessageConverter createFastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullNumberAsZero);
        config.setSerializeFilters(serializeFilters());
        converter.setFastJsonConfig(config);
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        return converter;
    }

    @Bean
    public SerializeFilter[] serializeFilters() {
        return new SerializeFilter[]{new BigIntegerValueFilter()};
    }

    private HttpMessageConverter<Object> createExcelHttpMessageConverter() {
        ExcelHttpMessageConverter excelHttpMessageConverter = new ExcelHttpMessageConverter();
        return excelHttpMessageConverter;
    }


    @Bean
    public ViewResolver contentNegotiatingViewResolver(
            ContentNegotiationManager manager) {
        // Define the view resolvers
        ViewResolver beanNameViewResolver = new BeanNameViewResolver();
        List<ViewResolver> resolvers = Lists.newArrayList(beanNameViewResolver);


        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setViewResolvers(resolvers);
        resolver.setContentNegotiationManager(manager);
        return resolver;
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(true)
                .useJaf(false)
                .favorParameter(true)
                .parameterName("format")
                .ignoreAcceptHeader(true)
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("json", MediaType.APPLICATION_JSON)
                .mediaType("xls", EXCEL_MEDIA_TYPE);
    }


}
