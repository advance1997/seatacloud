package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Result;
import com.advance.cloud.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-goods-provider", fallback = GoodsClientFallback.class)
public interface GoodsClient {

    @RequestMapping(method = RequestMethod.POST, value = "/reduce")
    Result reduceNum(@RequestParam("goodsId") int goodsId);

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    Goods getGoods(@RequestParam("goodsId") Integer goodsId);

}
