/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.aop;

import com.alibaba.fastjson.JSON;
import com.f6car.base.annotation.SecurityLog;
import com.f6car.base.core.F6Static;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author qixiaobo
 * @date 16/8/16
 */
@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class SecurityAspect {

    private static final String SEP = "|";
    private static final String SEP_N = ";";
    private static final String SECURITY_LOG_PREFIX = "SECURITY_LOG:";
    private static final String SEP_COMMA = ",";
    private static Logger logger = LoggerFactory.getLogger(SecurityAspect.class);
    @Value("${spring.application.name")
    private String source;

    @Around("@annotation(com.f6car.base.annotation.SecurityLog) && @annotation(securityLog)")
    public Object securityLog(ProceedingJoinPoint joinPoint, SecurityLog securityLog) throws Throwable {
        Object rlt = null;
        try {
            rlt = joinPoint.proceed();
            return rlt;
        } finally {
            buildSecurityLog(rlt, joinPoint, securityLog);
        }
    }

    private void buildSecurityLog(Object rlt, ProceedingJoinPoint joinPoint, SecurityLog secureLog) {
        try {
            String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
            String methodName = joinPoint.getSignature().getName();
            StringBuilder logStr = new StringBuilder().append(SECURITY_LOG_PREFIX)
                    .append("SecurityAspect").append(SEP)
                    .append(source).append(SEP_N)
                    .append(className).append(SEP_N)
                    .append(methodName).append(SEP_N)
                    .append(F6Static.getAction()).append(SEP_N)
                    .append(F6Static.getType()).append(SEP_N)
                    .append(F6Static.getIp()).append(SEP_N)
                    .append(F6Static.getOrg()).append(SEP_N)
                    .append(F6Static.getUser()).append(SEP_N);
            Object[] params = joinPoint.getArgs();
            if (secureLog != null && secureLog.showArgs() && params != null && params.length > 0) {
                logStr.append(JSON.toJSONString(params)).append(SEP_N);

            } else {
                logStr.append("").append(SEP_N);
            }
            if (secureLog != null && secureLog.showSql()) {
                logStr.append(JSON.toJSONString(F6Static.getSqlList())).append(SEP_N);
                F6Static.clearSql();
            } else {
                logStr.append("").append(SEP_N);
            }
            if (secureLog != null && secureLog.showResult() && rlt != null) {
                logStr.append(JSON.toJSONString(rlt)).append(SEP_N);
            } else {
                logStr.append("").append(SEP_N);
            }
            logger.info(logStr.toString());
        } catch (Exception ex) {
            logger.warn(ex.getMessage(), ex);
        }

    }
}
