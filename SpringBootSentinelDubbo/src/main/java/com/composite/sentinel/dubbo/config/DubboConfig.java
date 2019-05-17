package com.composite.sentinel.dubbo.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class DubboConfig {

    @Resource(name = "applicationConfig")
    private ApplicationConfig applicationConfig;

    @Resource(name = "registryConfig")
    private RegistryConfig registryConfig;

    @Resource(name = "protocolConfig")
    private ProtocolConfig protocolConfig;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider2");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setCheck(false);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        protocolConfig.setDispatcher("all");
        return protocolConfig;
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(3000);
        //远程服务调用重试次数
        providerConfig.setRetries(1);
        //延迟注册服务时间(毫秒)-，设为-1时，表示延迟到Spring容器初始化完成时暴露服务
        providerConfig.setDelay(-1);
        //提供方应用信息
        providerConfig.setApplication(applicationConfig);
        //向指定注册中心注册
        providerConfig.setRegistry(registryConfig);
        //协议名称
        providerConfig.setProtocol(protocolConfig);
        return providerConfig;
    }

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
