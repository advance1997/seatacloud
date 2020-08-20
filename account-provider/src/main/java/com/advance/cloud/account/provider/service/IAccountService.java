package com.advance.cloud.account.provider.service;

import com.advance.cloud.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IAccountService extends IService<Account> {

    /**
     * 扣钱
     * @param userId 用户id
     * @param money 金额
     */
    void reduceMoney(int userId, double money);

}
