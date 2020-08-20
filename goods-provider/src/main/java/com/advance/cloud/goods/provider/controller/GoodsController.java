package com.advance.cloud.goods.provider.controller;

import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.goods.provider.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/list")
    public Result listGoods(){
        return ResultFactory.success(goodsService.list());
    }

    @PutMapping
    public Result saveGoods(@RequestBody Goods goods){
        goodsService.save(goods);
        return ResultFactory.success();
    }

    @DeleteMapping("/{id}")
    public Result deleteGoods(@PathVariable("id")Integer id){
        goodsService.removeById(id);
        return ResultFactory.success();
    }

    @PostMapping("/reduce")
    public Result reduceGoodsNum(int goodsId){
        goodsService.reduceNum(goodsId);
        return ResultFactory.success();
    }

    @GetMapping("/get")
    public Goods getGoods(Integer goodsId){
        return goodsService.getById(goodsId);
    }

}
