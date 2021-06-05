package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper2 {
    //全部查询
    List<User> getUserList();
    //模糊查询
    List<User> getUserLike(String name);
    //根据id查询
    User getUserById(int id);
    //通过map查询，传入两个参数
    User getUserById2(Map<String,Object> map);
    //增加一个用户
    int addUser(User user);
    //通过map增加
    int addUser2(Map<String,Object> map);
    //修改
    int updateUser(User user);
    //删除
    int deleteUser(int id);
}
