package com.advance.cloud.account.provider.service.impl;

import com.advance.cloud.account.provider.mapper.AccountMapper;
import com.advance.cloud.account.provider.service.IAccountService;
import com.advance.cloud.entity.Account;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Override
    public void reduceMoney(int userId, double money) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Account::getUserId, userId);
        Account account = getOne(queryWrapper);
        double laseMoney = account.getMoney() - money;
        if(laseMoney < 0){
            throw  new RuntimeException("账户余额不足！");
        }
        account.setMoney(laseMoney);
        updateById(account);
    }
}
