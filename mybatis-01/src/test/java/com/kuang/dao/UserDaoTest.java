package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式1：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);//根据接口的类名绑定到xml中
        List<User> userList1 = mapper.getUserList();

        //方式2
        List<User> userList2 = sqlSession.selectList("com.com.com.kuang.dao.UserDao.getUserList");

        for (User user : userList1) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
