package com.study.dao;

import com.study.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();
    User getUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
}
