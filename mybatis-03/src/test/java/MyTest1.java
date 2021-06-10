import com.kuang.dao.UserMapper1;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest1 {
    @Test
    public void test_select(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);//根据接口的类名绑定到xml中
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }
}
