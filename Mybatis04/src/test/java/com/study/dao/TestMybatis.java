package com.study.dao;

import com.study.pojo.Student;
import com.study.pojo.Teacher;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: MybatisStudy
 * @description: test
 * @author: JJGGu
 * @create: 2020-05-21 21:35
 **/
public class TestMybatis {
    @Test
    public void getStudentById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentTeacher = mapper.getStudentTeacher2();
        for (Student student : studentTeacher) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStudents(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
