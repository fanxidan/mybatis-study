import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
        sqlSession.close();
    }

    @Test
    public void test_teacher_byId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        /*
        select s.id sid, s.name sname, t.name tname from student s,teacher t where s.tid=t.id
        */
        Teacher teacher = mapper.getTeacher_byId(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test_teacher_byId2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        /*
        select s.id sid, s.name sname, t.name tname from student s,teacher t where s.tid=t.id
        */
        Teacher teacher = mapper.getTeacher_byId2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
