package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper1 {
    //查询所有用户
    @Select("select * from user")
    List<User> getUsers();

    //根据id查询用户
    //方法存在多个参数，所有的参数前面必须加上@Param
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id_temp);

    //插入一条数据
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    //更新一条数据
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    //删除一条数据
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
