package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper2 {
    //根据id查询用户
    User queryUserById(@Param("id")int id);
}
