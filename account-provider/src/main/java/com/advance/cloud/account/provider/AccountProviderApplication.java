package com.advance.cloud.account.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.advance.cloud.account.provider.mapper")
@RefreshScope
public class AccountProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountProviderApplication.class, args);
    }

}
