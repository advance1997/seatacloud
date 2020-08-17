package com.advance.discovery.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: seatacloud
 * @description: 测试controller
 * @author: zhouh
 * @create: 2020-08-12 01:34
 **/
@RestController
@RequestMapping("/api/discovery/")
public class DiscoveryController {

    @RequestMapping("/{msg}")
    public String say(@PathVariable("msg")String msg){
        return msg;
    }
}
