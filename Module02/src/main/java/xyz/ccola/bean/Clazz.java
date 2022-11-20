package xyz.ccola.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ Name: Clazz
 * @ Author: Cola
 * @ Time: 2022/11/19 20:28
 * @ Description: 班级类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    private Integer clazzId;
    private String clazzName;

    /**
     * 学生列表
     */
    private List<Student> students;
}
