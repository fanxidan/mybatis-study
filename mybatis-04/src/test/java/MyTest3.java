import com.kuang.dao.UserMapper3;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MyTest3 {
    static Logger logger = Logger.getLogger(MyTest3.class);

    @Test
    public void test_select(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        //通过java sqlSession来实现分页
        List<User> user = sqlSession.selectList("com.com.com.kuang.dao.UserMapper3.getUserByRowBounds",null, rowBounds);
        for (User re : user) {
            System.out.println(re);
        }
        sqlSession.close();
    }
}
