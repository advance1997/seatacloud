package com.advance.cloud.user.provider.controller;

import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.entity.User;
import com.advance.cloud.user.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public Result listUser(){
        return ResultFactory.success(userService.list());
    }

    @PutMapping
    public Result saveUser(@RequestBody User user){
        userService.save(user);
        return ResultFactory.success();
    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable("id") Integer id){
        userService.removeById(id);
        return ResultFactory.success();
    }

    @GetMapping("/get")
    public User getUserById(Integer userId){
        return userService.getById(userId);
    }

}
