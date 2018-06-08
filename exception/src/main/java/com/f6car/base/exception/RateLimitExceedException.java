/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.exception;

/**
 * @author qixiaobo
 */
public class RateLimitExceedException extends ServiceException {

    private static final long serialVersionUID = -7451321838356599381L;

    public RateLimitExceedException() {
        super("rate limit execced!");
    }

    public RateLimitExceedException(String message) {
        super(message);
    }

    public RateLimitExceedException(String message, Throwable cause) {
        super(message, cause);
    }
}
