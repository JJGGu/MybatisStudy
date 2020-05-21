package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: MybatisStudy
 * @description: Test UserDao
 * @author: JJGGu
 * @create: 2020-05-20 14:05
 **/
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUsers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");

    }
}
