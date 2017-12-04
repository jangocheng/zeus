/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.constant;

/**
 * @author qixiaobo
 */
public class Constants {
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

}
