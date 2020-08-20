package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Message;
import com.advance.cloud.domain.Result;
import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class ItemClientFallback implements ItemClient {
    @Override
    public Result creatItem(DepositDTO depositDTO) {
        Result result = new Result();
        result.setCode(Message.FAILED.getCode());
        result.setMsg("创建订单异常！");
        result.setData(depositDTO);
        result.setSuccess(false);
        return result;
    }
}
