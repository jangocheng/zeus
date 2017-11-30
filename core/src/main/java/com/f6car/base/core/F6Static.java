/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import java.util.ArrayList;
import java.util.List;

public class F6Static {

    private static final ThreadLocal<ExcelExportParam> EXCEL_EXPORT_PARAM_TL = new ThreadLocal<>();
    private static final ThreadLocal<String> USER_TL = new ThreadLocal<>();
    private static final ThreadLocal<String> ORG_TL = new ThreadLocal<>();
    private static final ThreadLocal<String> IP_TL = new ThreadLocal<>();
    private static final List<ThreadLocal> THREAD_LOCAL_LIST = new ArrayList<>();

    static {
        THREAD_LOCAL_LIST.add(EXCEL_EXPORT_PARAM_TL);
        THREAD_LOCAL_LIST.add(USER_TL);
        THREAD_LOCAL_LIST.add(ORG_TL);
        THREAD_LOCAL_LIST.add(IP_TL);
    }

    public static ExcelExportParam getExcelExportParam() {
        return EXCEL_EXPORT_PARAM_TL.get();
    }

    public static void setExcelExportParam(ExcelExportParam excelExportParam) {
        EXCEL_EXPORT_PARAM_TL.set(excelExportParam);
    }

    public static String getUser() {
        return USER_TL.get();
    }

    public static void setUser(String user) {
        USER_TL.set(user);
    }

    public static String getOrg() {
        return ORG_TL.get();
    }

    public static void setOrg(String org) {
        ORG_TL.set(org);
    }

    public static String getIp() {
        return IP_TL.get();
    }

    public static void setIp(String ip) {
        IP_TL.set(ip);
    }

    public static void clearAll() {
        for (ThreadLocal threadLocal : THREAD_LOCAL_LIST) {
            threadLocal.remove();
        }

    }
}
