package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取老师
    List<Teacher> getTeacher();
    //获取指定老师下的所有学生及老师的信息
    //按结果嵌套查询
    Teacher getTeacher_byId(@Param("tid")int id);
    //子查询
    Teacher getTeacher_byId2(@Param("tid")int id);
}
