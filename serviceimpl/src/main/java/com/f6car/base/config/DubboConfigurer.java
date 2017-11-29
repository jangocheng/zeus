/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.config;

import com.air.tqb.service.user.UserService;
import com.air.tqb.shiro.api.RpcRealm;
import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qixiaobo
 */
@Configuration

public class DubboConfigurer {

    @Bean
    public Dubbo dubbo() {
        return new Dubbo();
    }

    @Bean
    public RegistryConfig registry(Dubbo dubbo) {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubbo.getZookeeperUrl());
        registryConfig.setProtocol("zookeeper");
        registryConfig.setDefault(false);
        registryConfig.setGroup(dubbo.getGroup());
        return registryConfig;
    }

    @Bean
    public ApplicationConfig applicationConfig(Dubbo dubbo) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubbo.getApplication());
        return applicationConfig;
    }


    @Bean
    public ProtocolConfig protocol(Dubbo dubbo) {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(dubbo.getPort());
        protocolConfig.setSerialization(dubbo.getSerialization());
        return protocolConfig;
    }


    @Bean
    public ProviderConfig provider(Dubbo dubbo) {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(dubbo.getTimeOut());
        providerConfig.setOwner(dubbo.getOwner());
        providerConfig.setGroup(dubbo.getGroup());
        return providerConfig;
    }

    @Bean
    public ConsumerConfig consumer(Dubbo dubbo) {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(dubbo.getTimeOut());
        consumerConfig.setOwner(dubbo.getOwner());
        consumerConfig.setGroup(dubbo.getGroup());
        return consumerConfig;
    }

    @Bean
    public ReferenceBean<RpcRealm> rpcRealm(RegistryConfig registryConfig, ApplicationConfig applicationConfig, ConsumerConfig consumerConfig, Dubbo dubbo) {
        ReferenceBean<RpcRealm> ref = new ReferenceBean<>();
        ref.setInterface(RpcRealm.class);
        ref.setRegistry(registryConfig);
        ref.setApplication(applicationConfig);
        ref.setConsumer(consumerConfig);
        ref.setGroup(dubbo.getGroup());
        ref.setCheck(true);
        return ref;
    }


    @Bean
    public ReferenceBean<UserService> userService(RegistryConfig registryConfig, ApplicationConfig applicationConfig, ConsumerConfig consumerConfig, Dubbo dubbo) {
        ReferenceBean<UserService> ref = new ReferenceBean<>();
        ref.setInterface(UserService.class);
        ref.setRegistry(registryConfig);
        ref.setApplication(applicationConfig);
        ref.setConsumer(consumerConfig);
        ref.setGroup(dubbo.getGroup());
        ref.setCheck(true);
        return ref;
    }


}

