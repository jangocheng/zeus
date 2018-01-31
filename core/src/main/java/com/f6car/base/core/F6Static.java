/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qixiaobo
 */
public final class F6Static {
    private F6Static() {

    }

    private static final ThreadLocal<ExcelExportParam> EXCEL_EXPORT_PARAM_TL = new ThreadLocal<>();
    private static final ThreadLocal<BigInteger> USER_TL = new ThreadLocal<>();
    private static final ThreadLocal<BigInteger> ORG_TL = new ThreadLocal<>();
    private static final ThreadLocal<String> IP_TL = new ThreadLocal<>();
    private static final ThreadLocal<List<String>> SQL_LIST_TL = new ThreadLocal<>();
    private static final ThreadLocal<String> ACTION_TL = new ThreadLocal<>();
    private static final ThreadLocal<ActionType> TYPE_TL = new ThreadLocal<>();
    private static final List<ThreadLocal> THREAD_LOCAL_LIST = new ArrayList<>();

    static {
        THREAD_LOCAL_LIST.add(EXCEL_EXPORT_PARAM_TL);
        THREAD_LOCAL_LIST.add(USER_TL);
        THREAD_LOCAL_LIST.add(ORG_TL);
        THREAD_LOCAL_LIST.add(IP_TL);
        THREAD_LOCAL_LIST.add(ACTION_TL);
        THREAD_LOCAL_LIST.add(TYPE_TL);
        THREAD_LOCAL_LIST.add(SQL_LIST_TL);
    }

    public static ExcelExportParam getExcelExportParam() {
        return EXCEL_EXPORT_PARAM_TL.get();
    }

    public static void setExcelExportParam(ExcelExportParam excelExportParam) {
        EXCEL_EXPORT_PARAM_TL.set(excelExportParam);
    }

    public static BigInteger getUser() {
        return USER_TL.get();
    }

    public static void setUser(BigInteger user) {
        USER_TL.set(user);
    }

    public static BigInteger getOrg() {
        return ORG_TL.get();
    }

    public static void setOrg(BigInteger org) {
        ORG_TL.set(org);
    }

    public static String getIp() {
        return IP_TL.get();
    }

    public static void setIp(String ip) {
        IP_TL.set(ip);
    }

    public static List<String> getSqlList() {
        return SQL_LIST_TL.get();
    }

    public static void addSql(String sql) {
        if (SQL_LIST_TL.get() == null) {
            SQL_LIST_TL.set(new ArrayList<String>());
        }
        SQL_LIST_TL.get().add(sql);
    }

    public static void clearSql() {
        SQL_LIST_TL.remove();
    }

    public static ActionType getType() {
        return TYPE_TL.get();
    }


    public static void setType(ActionType type) {
        TYPE_TL.set(type);
    }

    public static String getAction() {
        return ACTION_TL.get();
    }

    public static void setAction(String action) {
        ACTION_TL.set(action);
    }

    public static void clearAction() {
        ACTION_TL.remove();
    }

    public static void clearType() {
        TYPE_TL.remove();
    }

    public static void clearAll() {
        for (ThreadLocal threadLocal : THREAD_LOCAL_LIST) {
            threadLocal.remove();
        }

    }

    public enum ActionType {
        WEB, RMI, DUBBO
    }
}
