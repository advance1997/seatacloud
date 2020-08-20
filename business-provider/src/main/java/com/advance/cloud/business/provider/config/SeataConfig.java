package com.advance.cloud.business.provider.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeataConfig {

    @Autowired
    private ApplicationContext applicationContext;
    /**
     * 初始化全局事务Scanner
     *
     * @Return: GlobalTransactionScanner
     */
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        String applicationName = this.applicationContext.getEnvironment().getProperty("spring.application.name");
        String txServiceGroup = this.applicationContext.getEnvironment().getProperty("spring.cloud.alibaba.seata.tx-service-group");
        return new GlobalTransactionScanner(applicationName , txServiceGroup);
    }

}
