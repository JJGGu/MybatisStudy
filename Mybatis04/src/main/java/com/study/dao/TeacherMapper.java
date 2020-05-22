package com.study.dao;

import com.study.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from mybatis.teacher where id = #{id}")
    Teacher getTeacherById(@Param("id") int id);
}
