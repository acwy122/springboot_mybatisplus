package com.msb;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.msb.mapper.UserMapper;
import com.msb.pojo.User;
import com.msb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

//    @Autowired
//    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    void testFindAll() {
//        User byUid = userMapper.findByUid(1);
//        System.out.println(byUid);

        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

    @Test
    void testQueryWrapper() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq("uid",1);
        queryWrapper.ge("uid",20);
        List<User> list = userService.list(queryWrapper);
        list.forEach(System.out::println);


    }

}
