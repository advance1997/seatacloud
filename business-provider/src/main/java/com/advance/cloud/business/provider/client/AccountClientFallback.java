package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Message;
import com.advance.cloud.domain.Result;
import org.springframework.stereotype.Component;

@Component
public class AccountClientFallback implements AccountClient {

    @Override
    public Result listAccount() {
        Result result = new Result();
        result.setCode(Message.FAILED.getCode());
        result.setMsg(Message.FAILED.getMsg());
        result.setSuccess(false);
        return result;
    }

    @Override
    public Result reduceMoney(Integer userId, double money) {
        Result result = new Result();
        result.setCode(Message.FAILED.getCode());
        result.setMsg("账户扣款失败！");
        result.setSuccess(false);
        return result;
    }
}
