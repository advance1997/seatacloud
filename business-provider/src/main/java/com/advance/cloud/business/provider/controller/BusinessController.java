package com.advance.cloud.business.provider.controller;

import com.advance.cloud.business.provider.client.AccountClient;
import com.advance.cloud.business.provider.client.GoodsClient;
import com.advance.cloud.business.provider.client.UserClient;
import com.advance.cloud.business.provider.service.IBusinessService;
import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private GoodsClient goodsClient;
    @Autowired
    private IBusinessService businessService;

    @GetMapping("/user/list")
    public Result listUser(){
        return userClient.listUser();
    }

    @GetMapping("/account/list")
    public Result listAccount(){
        return accountClient.listAccount();
    }

    @GetMapping("/user/get/{id}")
    public Result getUser(@PathVariable("id")Integer id){
        return ResultFactory.success(userClient.getUser(id));
    }

    @PostMapping("/goods/reduce/{goodsId}")
    public Result reduceGoodsNum(@PathVariable("goodsId")Integer goodsId){
        goodsClient.reduceNum(goodsId);
        return ResultFactory.success();
    }

    @PostMapping("/buy")
    public Result doBuy(int userId, int goodsId){
        return businessService.doBuy(userId, goodsId);
    }
}
