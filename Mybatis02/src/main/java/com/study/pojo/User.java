package com.study.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @program: MybatisStudy
 * @description: User 实体类
 * @author: JJGGu
 * @create: 2020-05-20 12:50
 **/

public class User {
    private int id;
    private String name;
    private String password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
