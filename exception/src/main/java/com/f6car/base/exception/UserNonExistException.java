/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.exception;

/**
 * Created by qixiaobo on 2018/2/24.
 */
public class UserNonExistException extends BaseException {

    private static final long serialVersionUID = -238222146431542373L;

    public UserNonExistException() {
    }

    public UserNonExistException(String message) {
        super(message);
    }

    public UserNonExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNonExistException(Throwable cause) {
        super(cause);
    }

    public UserNonExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
