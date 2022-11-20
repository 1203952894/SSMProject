package xyz.ccola.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.ccola.service.TeacherService;

/**
 * @ Name: TeacherController
 * @ Author: Cola
 * @ Time: 2022/11/19 22:57
 * @ Description: TeacherController 控制层
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherController {
    private TeacherService teacherService;

    /**
     * 保存用户
     */
    public void saveTeacher() {
        teacherService.saveTeacher();
    }

}
