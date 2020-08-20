package com.advance.cloud.business.provider.service;

import com.advance.cloud.domain.Result;

public interface IBusinessService {

    Result doBuy(Integer userId, Integer goodsId);

}
