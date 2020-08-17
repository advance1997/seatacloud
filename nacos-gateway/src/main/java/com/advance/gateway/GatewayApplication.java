package com.advance.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @program: seatacloud
 * @description: 网关启动类
 * @author: zhouh
 * @create: 2020-08-12 12:55
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
