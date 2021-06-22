import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class MyTest {
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("title0");
        blog.setAuthor("a");
        blog.setCreateTime(new Date());
        blog.setViews(100);
        int i = mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("title1");
        blog.setAuthor("b");
        blog.setCreateTime(new Date());
        i = mapper.addBook(blog);

        session.close();
    }
}
