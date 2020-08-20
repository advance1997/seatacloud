package com.advance.cloud.dto;

import com.advance.cloud.entity.Goods;
import com.advance.cloud.entity.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class DepositDTO implements Serializable {

    private User user;

    private Goods goods;

}
