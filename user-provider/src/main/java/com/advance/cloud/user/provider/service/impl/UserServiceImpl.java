package com.advance.cloud.user.provider.service.impl;

import com.advance.cloud.entity.User;
import com.advance.cloud.user.provider.mapper.UserMapper;
import com.advance.cloud.user.provider.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
