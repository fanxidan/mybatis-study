package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生及对应的老师的信息
    List<Student> getStudent();
}
