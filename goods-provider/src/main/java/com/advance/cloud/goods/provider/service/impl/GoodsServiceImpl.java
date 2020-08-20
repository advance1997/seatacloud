package com.advance.cloud.goods.provider.service.impl;

import com.advance.cloud.entity.Goods;
import com.advance.cloud.goods.provider.mapper.GoodsMapper;
import com.advance.cloud.goods.provider.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Override
    public void reduceNum(int goodsId) {
        Goods goods = getById(goodsId);
        int num = goods.getNum() - 1;
        if(num < 0){
            throw new RuntimeException("库存不知足！");
        }
        goods.setNum(num);
        updateById(goods);
    }
}
