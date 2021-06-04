package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest2 {
    @Test
    public void test_selectAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void test_select(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }
    @Test
    public void test_insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        int res = mapper.addUser(new User(4, "d", "d"));
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test_update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        int res = mapper.updateUser(new User(4, "dd", "dd"));
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test_delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        int res = mapper.deleteUser(4);
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
