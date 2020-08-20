package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Result;
import com.advance.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-user-provider", fallback = UserClientFallback.class)
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/list",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    Result listUser();

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    User getUser(@RequestParam("userId")Integer userId);

}
