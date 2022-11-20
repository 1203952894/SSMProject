package xyz.ccola.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.ccola.dao.TeacherDao;
import xyz.ccola.service.TeacherService;

/**
 * @ Name: TeacherServiceImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 22:57
 * @ Description: TeacherServiceImpl
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private TeacherDao teacherDao;

    @Override
    public void saveTeacher() {
        teacherDao.saveTeacher();
    }
}
