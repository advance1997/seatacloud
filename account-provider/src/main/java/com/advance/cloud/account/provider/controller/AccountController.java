package com.advance.cloud.account.provider.controller;

import com.advance.cloud.account.provider.service.IAccountService;
import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("/list")
    public Result listAccount(){
        return ResultFactory.success(accountService.list());
    }

    @PutMapping
    public Result saveAccount(@RequestBody Account account){
        accountService.save(account);
        return ResultFactory.success(account);
    }

    @DeleteMapping("/{id}")
    public Result deleteAccount(@PathVariable("id")Integer id){
        accountService.removeById(id);
        return ResultFactory.success();
    }

    @PostMapping("/reduce")
    public Result reduceMoney(Integer userId, double money){
        accountService.reduceMoney(userId, money);
        return ResultFactory.success();
    }

}
