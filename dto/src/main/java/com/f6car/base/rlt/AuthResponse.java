/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.rlt;

import com.f6car.base.common.Vo;

import java.util.Objects;

/**
 * @author qixiaobo
 * @date 2018/2/24
 */
public class AuthResponse extends Vo {
    private static final long serialVersionUID = -4538567680398141977L;
    private JwtToken accessToken;
    private JwtToken refreshToken;


    public AuthResponse(JwtToken accessToken, JwtToken refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public AuthResponse() {
    }

    public JwtToken getAccessToken() {

        return accessToken;
    }

    public void setAccessToken(JwtToken accessToken) {
        this.accessToken = accessToken;
    }

    public JwtToken getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(JwtToken refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthResponse)) {
            return false;
        }
        AuthResponse that = (AuthResponse) o;
        return Objects.equals(accessToken, that.accessToken) &&
                Objects.equals(refreshToken, that.refreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, refreshToken);
    }

    @Override
    public String toString() {
        return "AuthResponse{" +
                "accessToken=" + accessToken +
                ", refreshToken=" + refreshToken +
                '}';
    }
}
