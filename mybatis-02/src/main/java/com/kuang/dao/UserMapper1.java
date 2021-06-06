package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper1 {
    List<User> getUserList();
    //查询
    User getUserById(int id);
    //增加
    int addUser(User user);
    //修改
    int updateUser(User user);
    //删除
    int deleteUser(int id);
}
