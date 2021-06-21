import com.kuang.dao.StudentMapper2;
import com.kuang.pojo.Student;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest2 {
    //按照结果嵌套处理
    @Test
    public void Test_Select_Student(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper2 mapper = sqlSession.getMapper(StudentMapper2.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
