package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Message;
import com.advance.cloud.domain.Result;
import com.advance.cloud.entity.Goods;
import org.springframework.stereotype.Component;

@Component
public class GoodsClientFallback implements GoodsClient {

    @Override
    public Result reduceNum(int goodsId) {
        Result result = new Result();
        result.setCode(Message.FAILED.getCode());
        result.setMsg(Message.FAILED.getMsg());
        result.setData(goodsId);
        result.setSuccess(false);
        return result;
    }

    @Override
    public Goods getGoods(Integer goodsId) {
        return null;
    }
}
