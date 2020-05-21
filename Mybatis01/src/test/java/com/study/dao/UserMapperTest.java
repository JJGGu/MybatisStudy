package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
    @Test
    public void test(){
        //获取session
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //方式一
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.getUsers();

            //方式二
//            List<User> userList = sqlSession.selectList("com.study.dao.UserMapper.getUsers");
            for (User user : users) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            //关闭session
            sqlSession.close();
        }
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(6,"哈哈哈", "12333"));

        sqlSession.commit();
        System.out.println("OK");
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(6, "hhh", "11111"));
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void insertUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("id", 7);
        map.put("name", "JJGGu");
        map.put("password", "1233332");
        mapper.insertUser2(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectLikeId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> likeUser = mapper.getLikeUser("%E%");

        for (User user : likeUser) {
            System.out.println(user);
        }
        System.out.println("OK");
        sqlSession.close();
    }
}
