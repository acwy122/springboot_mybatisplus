package com.msb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    public User findByUid(Integer uid);
}
