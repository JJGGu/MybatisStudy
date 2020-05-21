package com.study.dao;

import com.study.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUsers();

    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into mybatis.user(id, name, pwd) values(#{id}, #{name}, #{pwd})")
    void insertUser(User user);

    @Delete("delete from mybatis.user where id = #{id}")
    int deleteUser(@Param("id") int id);

    @Update("update mybatis.user set name = #{name}, pwd = #{pwd} where id = #{id}")
    int updateUser(User user);
}
