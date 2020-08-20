package com.advance.cloud.item.provider.controller;

import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Deposit;
import com.advance.cloud.item.provider.service.IDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    private IDepositService depositService;

    @GetMapping("/list")
    public Result listItem(){
        return ResultFactory.success(depositService.list());
    }

    @PutMapping
    public Result saveItem(@RequestBody Deposit deposit){
        depositService.save(deposit);
        return ResultFactory.success();
    }

    @DeleteMapping("/{id}")
    public Result deleteItem(@PathVariable("id")long id){
        depositService.removeById(id);
        return ResultFactory.success();
    }

    @PutMapping("/create")
    public Result createDeposit(@RequestBody DepositDTO depositDTO){
        depositService.createItem(depositDTO);
        return ResultFactory.success();
    }
}
