package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MybatisStudy
 * @description: Test
 * @author: JJGGu
 * @create: 2020-05-21 17:04
 **/
public class UserTest {
    @Test
    public void getUsersTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }*/

        /*User user = mapper.getUserById(2);
        System.out.println(user);*/

        mapper.updateUser(new User(2,"uuu", "3412"));
        sqlSession.close();

    }
}
