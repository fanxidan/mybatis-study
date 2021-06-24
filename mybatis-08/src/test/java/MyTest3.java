import com.kuang.dao.BlogMapper3;
import com.kuang.pojo.Blog;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyTest3 {
    @Test
    public void queryBlogIf(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper3 mapper = session.getMapper(BlogMapper3.class);
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
    public void queryBlogforeach(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper3 mapper = session.getMapper(BlogMapper3.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        hashMap.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogforeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }
}
