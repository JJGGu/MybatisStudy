package com.study.dao;

import com.study.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUsers();
    User getUserById(int id);
    void insertUser(User user);
    void updateUser(User user);

    void insertUser2(Map<String, Object> map);

    List<User> getLikeUser(String name);
}
