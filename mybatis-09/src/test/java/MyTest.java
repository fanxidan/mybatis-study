import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println("第一次查询：");
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("第二次查询：");
        user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("==========================================");
        System.out.println("第一次查询：");
        user = mapper.queryUserById(1);
        System.out.println(user);
        session.clearCache();//手动清理缓存
        System.out.println("第二次查询：");
        user = mapper.queryUserById(1);
        System.out.println(user);
        session.close();
    }
}
