package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper2 {
    List<User> getUserList();
    //模糊查询
    List<User> getUserLike(String name);
    //查询
    User getUserById(int id);
    //查询
    User getUserById2(Map<String,Object> map);
    //增加
    int addUser(User user);
    //增加
    int addUser2(Map<String,Object> map);
    //修改
    int updateUser(User user);
    //删除
    int deleteUser(int id);
}
