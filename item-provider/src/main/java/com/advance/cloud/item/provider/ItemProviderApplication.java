package com.advance.cloud.item.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.advance.cloud.item.provider.mapper")
public class ItemProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication.class, args);
    }

}
