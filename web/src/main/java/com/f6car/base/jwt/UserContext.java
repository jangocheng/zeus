/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.jwt;


import com.google.common.base.Strings;

import java.util.List;

/**
 * @author qixiaobo
 */
public class UserContext {
    private final String username;
    private final String idOwnOrg;
    private final List<String> authorities;

    private UserContext(String username, List<String> authorities, String idOwnOrg) {
        this.username = username;
        this.authorities = authorities;
        this.idOwnOrg = idOwnOrg;
    }

    public static UserContext create(String username, List<String> authorities, String idOwnOrg) {
        if (Strings.isNullOrEmpty(username)) {
            throw new IllegalArgumentException("Username is blank: " + username);
        }
        return new UserContext(username, authorities, idOwnOrg);
    }

    public String getUsername() {
        return username;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public String getIdOwnOrg() {
        return idOwnOrg;
    }
}
