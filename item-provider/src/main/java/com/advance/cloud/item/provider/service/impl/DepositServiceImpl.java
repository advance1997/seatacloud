package com.advance.cloud.item.provider.service.impl;

import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Deposit;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import com.advance.cloud.item.provider.mapper.DepositMapper;
import com.advance.cloud.item.provider.service.IDepositService;
import com.advance.cloud.utils.IdGenerator;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl extends ServiceImpl<DepositMapper, Deposit> implements IDepositService {
    @Override
    public void createItem(DepositDTO depositDTO) {
        User user = depositDTO.getUser();
        Goods goods = depositDTO.getGoods();
        Deposit deposit = new Deposit();
        deposit.setItemOrder(IdGenerator.getId());
        deposit.setUserId(user.getId());
        deposit.setGoodsId(goods.getId());
        deposit.setAddress(user.getAddress());
        deposit.setNickName(user.getName());
        deposit.setPrice(goods.getPrice());
        save(deposit);
    }
}
