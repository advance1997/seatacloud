package com.advance.cloud.config.controller;

import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    String name;

    @Value("${user.age}")
    int age;

    @RequestMapping("/getConfig")
    public Result getConfigData(){
        return ResultFactory.success( "Hello, "+name+"，你今年是不是"+age+"岁");
    }

}
