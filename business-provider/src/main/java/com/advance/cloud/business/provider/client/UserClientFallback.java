package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Message;
import com.advance.cloud.domain.Result;
import com.advance.cloud.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public Result listUser() {
        Result result = new Result();
        result.setCode(Message.FAILED.getCode());
        result.setMsg(Message.FAILED.getMsg());
        result.setSuccess(false);
        result.setData(new ArrayList<>());
        return result;
    }

    @Override
    public User getUser(Integer userId) {
        return null;
    }

}
