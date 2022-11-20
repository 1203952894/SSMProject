package xyz.ccola.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: Teacher
 * @ Author: Cola
 * @ Time: 2022/11/19 20:32
 * @ Description: Teacher 类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer teacherId;
    private String teacherName;
}
