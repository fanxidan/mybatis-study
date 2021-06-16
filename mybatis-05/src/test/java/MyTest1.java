import com.kuang.dao.UserMapper1;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest1 {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test_UserByID(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        User user = mapper.getUserByID(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void test_addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        int i = mapper.addUser(new User(6,"f","f"));
        sqlSession.close();
    }
    @Test
    public void test_updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        int i = mapper.updateUser(new User(4,"g","g"));
        sqlSession.close();
    }

    @Test
    public void test_deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        int i = mapper.deleteUser(4);
        sqlSession.close();
    }
}
