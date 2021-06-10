package com.kuang.pojo;

public class User {
    private int id;
    private String name;
    //与数据库字段名不一致
    private String password;

    //该无参构造函数会导致查询到的pwd为空
    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + password + '\'' +
                '}';
    }
}
