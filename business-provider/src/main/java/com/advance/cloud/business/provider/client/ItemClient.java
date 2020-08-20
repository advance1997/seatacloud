package com.advance.cloud.business.provider.client;

import com.advance.cloud.domain.Result;
import com.advance.cloud.dto.DepositDTO;
import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "seata-item-provider", fallback = ItemClientFallback.class)
public interface ItemClient {

    @RequestMapping(method = RequestMethod.PUT, value = "/create")
    Result creatItem(@RequestBody DepositDTO depositDTO);

}
