import com.kuang.dao.UserMapper2;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class MyTest2 {
    static Logger logger = Logger.getLogger(MyTest2.class);

    @Test
    public void test_select(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);//根据接口的类名绑定到xml中
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("startIndex",2);
        hashMap.put("pageSize",2);
        List<User> res = mapper.getUserByLimit(hashMap);
        for (User re : res) {
            System.out.println(re);
        }
        sqlSession.close();
    }
}
