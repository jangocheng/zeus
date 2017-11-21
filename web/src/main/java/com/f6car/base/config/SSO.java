/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.baomidou.kisso.SSOConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

/**
 * @author qixiaobo
 */
@ConfigurationProperties(prefix = "sso", ignoreUnknownFields = true)
public class SSO {
    private String secretkey;
    private String cookieName;
    private String cookieDomain;
    private String loginUrl;
    private String logoutUrl;
    private boolean cookieBrowser;

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getCookieDomain() {
        return cookieDomain;
    }

    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public boolean isCookieBrowser() {
        return cookieBrowser;
    }

    public void setCookieBrowser(boolean cookieBrowser) {
        this.cookieBrowser = cookieBrowser;
    }

    @PostConstruct
    public void init() {

        SSOConfig.setInstance(toSSoConfig());
    }

    private SSOConfig toSSoConfig() {
        SSOConfig ssoConfig = new SSOConfig();
        ssoConfig.setLoginUrl(loginUrl);
        ssoConfig.setLogoutUrl(logoutUrl);
        ssoConfig.setSecretkey(secretkey);
        ssoConfig.setCookieDomain(cookieDomain);
        ssoConfig.setCookieName(cookieName);
        ssoConfig.setCookieBrowser(cookieBrowser);
        return ssoConfig;
    }
}