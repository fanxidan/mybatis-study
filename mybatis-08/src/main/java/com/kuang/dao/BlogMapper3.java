package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper3 {
    //查询博客
    List<Blog> queryBlogIF(Map map);
    //查询第1-2-3号记录的博客
    List<Blog> queryBlogforeach(Map map);
}
