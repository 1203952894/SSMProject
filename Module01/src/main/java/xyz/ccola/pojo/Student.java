package xyz.ccola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: Student
 * @ Author: Cola
 * @ Time: 2022/11/19 17:17
 * @ Description: Student 类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
}
