/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.constant;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author qixiaobo
 */
public final class Constants {
    private Constants() {

    }

    public static final String BASE_PACKAGE = "com.f6car.base";
    //Model所在包
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".po";
    //Mapper所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";

    //Service所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";
    //ServiceImpl所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";
    //Controller所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";

    public static final String TEST_PACKAGE = BASE_PACKAGE + ".test";

    //vo所在包
    public static final String VO_PACKAGE = BASE_PACKAGE + ".vo";

    //so所在包
    public static final String SO_PACKAGE = BASE_PACKAGE + ".so";

    //Mapper插件基础接口的完全限定名
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";

    public static final String IP_UNKNOWN = "unknown";
    public static final String COMMA = ",";
    public static final String STRIKE = "-";
    public static final String UNDER_LINE = "_";

    public static final String LEVEL_PRIMARY = "primary";
    public static final String LEVEL_SECOND = "second";

    public static final String SESSION_ATTRIBUTE_NAME_USER = "user";

    public static final String SESSION_ATTRIBUTE_NAME_CSRF_TOKEN = "csrf";

    public static final String HTTP_HEADER_NAME_CSRF_TOKEN = "csrf";


    public static final double DOUBLE_EQUALE_GAP = 0.00001d;

    public static final String DEFAULT_DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_DAY_FORMAT_PATTERN = "yyyy-MM-dd";
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";


    /**
     * 过滤掉31以下的ascii码以及双引号和反斜扛
     */
    public static final CharMatcher CARZONE_API_DANGER_CHAR_MATCHER = CharMatcher.inRange('\0', '\u001F')
            .or(CharMatcher.is('\\'))
            .or(CharMatcher.BREAKING_WHITESPACE);
    /**
     * HTTP HEADER
     */
    public static final String AUTHENTICATION = "Authentication";

    public static final String AUTHORIZATION = "Authorization";
    public static final String AUTH_HEADER_START_STR = "Bearer ";

    public static final List<String> WHITE_LIST_SUBJECT = Lists.newArrayList("f6car", "repairWeb", "carOwner", "weixin");


    public static final int ERROR_TOKEN = -1;
    public static final int ERROR_OTHER = -2;

    public static final String AGENT_JSON_KEY = "data";

    public static final String PROPERTY_WEB_SECURE = "web_secure";
    public static final String WEB_SECURE_JWT = "jwt";
    public static final String WEB_SECURE_KISSO = "kisso";

    public static final String PROPERTY_WEB_RATE = "web_rate";

}
