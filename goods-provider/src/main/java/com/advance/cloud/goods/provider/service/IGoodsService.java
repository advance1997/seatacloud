package com.advance.cloud.goods.provider.service;

import com.advance.cloud.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IGoodsService extends IService<Goods> {

    /**
     * 减库存
     * @param goodsId
     */
    void reduceNum(int goodsId);

}
