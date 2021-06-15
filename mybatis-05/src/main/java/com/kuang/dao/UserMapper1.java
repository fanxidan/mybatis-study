package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper1 {
    @Select("select * from user")
    List<User> getUsers();
}
