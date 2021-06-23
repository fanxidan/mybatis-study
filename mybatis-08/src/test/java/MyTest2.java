import com.kuang.dao.BlogMapper2;
import com.kuang.pojo.Blog;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest2 {
    @Test
    public void queryBlogIf(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper2 mapper = session.getMapper(BlogMapper2.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","title0");
        hashMap.put("author","a");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper2 mapper = session.getMapper(BlogMapper2.class);
        HashMap hashMap = new HashMap();
        //views满足条件则可以查询出来
        hashMap.put("views","100");
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void queryupdateBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper2 mapper = session.getMapper(BlogMapper2.class);
        HashMap hashMap = new HashMap();
        //更新title和author
        hashMap.put("title","title3");
        hashMap.put("author","c");
        hashMap.put("id","4cab6a0ef6ab43a8a76718fde68fcacd");
        mapper.updateBlog(hashMap);
        session.close();
    }
}
