package xyz.ccola.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @ Name: Student
 * @ Author: Cola
 * @ Time: 2022/11/19 20:26
 * @ Description: 学生类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String[] hobbies;
    /**
     * 班级
     */
    private Clazz clazz;

    /**
     * 老师
     */
    private Map<String, Teacher> teachers;


}
