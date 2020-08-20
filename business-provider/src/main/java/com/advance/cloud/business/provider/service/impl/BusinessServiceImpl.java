package com.advance.cloud.business.provider.service.impl;

import com.advance.cloud.business.provider.client.AccountClient;
import com.advance.cloud.business.provider.client.GoodsClient;
import com.advance.cloud.business.provider.client.ItemClient;
import com.advance.cloud.business.provider.client.UserClient;
import com.advance.cloud.business.provider.service.IBusinessService;
import com.advance.cloud.domain.Result;
import com.advance.cloud.domain.ResultFactory;
import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusinessServiceImpl implements IBusinessService {

    @Autowired
    private UserClient userClient;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private GoodsClient goodsClient;
    @Autowired
    private ItemClient itemClient;

    @GlobalTransactional(timeoutMills = 30000, name = "seata-business-provider")
//    @Transactional
    @Override
    public Result doBuy(Integer userId, Integer goodsId) {
        User user = userClient.getUser(userId);
        Goods goods = goodsClient.getGoods(goodsId);
        if(null == user || null == goods){
            return ResultFactory.error();
        }
        //创建订单
        DepositDTO depositDTO = new DepositDTO();
        depositDTO.setUser(user);
        depositDTO.setGoods(goods);
        itemClient.creatItem(depositDTO);
        //扣库存
        goodsClient.reduceNum(goods.getId());
        //扣款
        accountClient.reduceMoney(user.getId(), goods.getPrice());
        return ResultFactory.success();
    }
}
