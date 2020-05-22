package com.study.dao;

import com.study.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from mybatis.student where id = #{id}")
    Student getStudentById(@Param("id") int id);

    List<Student> getStudentTeacher();
    List<Student> getStudentTeacher2();

    List<Student> getStudents();

}
