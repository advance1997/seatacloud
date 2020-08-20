package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-account-provider")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/list",consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    Result listAccount();

    @RequestMapping(method = RequestMethod.POST, value = "/reduce")
    Result reduceMoney(@RequestParam("userId")Integer userId, @RequestParam("money")double money);

}
