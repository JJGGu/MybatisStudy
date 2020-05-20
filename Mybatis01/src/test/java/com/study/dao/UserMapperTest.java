package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MybatisStudy
 * @description: Test UserDao
 * @author: JJGGu
 * @create: 2020-05-20 14:05
 **/
public class UserMapperTest {
    @Test
    public void test(){
        //获取session
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = userMapper.getUsers();

        //方式二
        List<User> userList = sqlSession.selectList("com.study.dao.UserMapper.getUsers");
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭session
        sqlSession.close();
    }
}
