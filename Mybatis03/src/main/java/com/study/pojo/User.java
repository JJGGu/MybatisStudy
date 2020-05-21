package com.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: MybatisStudy
 * @description: User 实体类
 * @author: JJGGu
 * @create: 2020-05-20 12:50
 **/

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;


}
