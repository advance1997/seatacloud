package com.advance.cloud.item.provider.service;

import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Deposit;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IDepositService extends IService<Deposit> {

    void createItem(DepositDTO depositDTO);

}
