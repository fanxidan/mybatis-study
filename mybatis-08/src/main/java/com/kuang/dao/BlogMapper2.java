package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper2 {
    //查询博客
    List<Blog> queryBlogIF(Map map);
    //查询博客
    List<Blog> queryBlogChoose(Map map);
    //更新博客
    int updateBlog(Map map);
}
