package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest3 {
    //模糊查询
    @Test
    public void test_selectLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        List<User> userList = mapper.getUserLike("e");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    //全部查询
    @Test
    public void test_selectAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    //根据id查询
    @Test
    public void test_select(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }
    //通过map查询，传入两个参数
    @Test
    public void test_select2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("user_id","2");
        hashMap.put("user_name","b");
        User userById2 = mapper.getUserById2(hashMap);
        System.out.println(userById2);
        sqlSession.close();
    }
    @Test
    public void test_insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        int res = mapper.addUser(new User(4, "d", "d"));
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    //通过map增加
    @Test
    public void test_insert2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("user_id","5");
        hashMap.put("user_name","e");
        hashMap.put("user_pwd","e");
        int res = mapper.addUser2(hashMap);
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test_update(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        int res = mapper.updateUser(new User(4, "dd", "dd"));
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test_delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        int res = mapper.deleteUser(4);
        System.out.println("res:" + res);
        //增删改必须提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
