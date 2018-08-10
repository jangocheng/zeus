/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.f6car.base.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static com.f6car.base.constant.Constants.AUTHENTICATION;

/**
 * @author qixiaobo
 */
@Profile({"!prod", "!unit-test"})
@Configuration
@EnableSwagger2
@Lazy
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(@Autowired(required = false) List<Parameter> parameterList) {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("使用Swagger2构建RESTful APIs")
                .description("客户端与服务端接口文档")
                .termsOfServiceUrl("http://qixiaobo.site")
                .contact("qixiaobo")
                .version("1.0.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage(Constants.CONTROLLER_PACKAGE))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(parameterList);
    }

    @ConditionalOnProperty(name = Constants.PROPERTY_WEB_SECURE, havingValue = Constants.WEB_SECURE_JWT)
    @Bean
    public Parameter authHeader() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        tokenPar.name(AUTHENTICATION).description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        return tokenPar.build();
    }

}


