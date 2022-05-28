package com.msb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msb.mapper.UserMapper;
import com.msb.pojo.User;
import com.msb.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
