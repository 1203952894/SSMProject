package xyz.ccola.impl;

import xyz.ccola.dao.TeacherDao;

/**
 * @ Name: TeacherDaoImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 22:59
 * @ Description: TeacherDaoImpl
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void saveTeacher() {
        System.out.println("保存 Teacher");
    }
}
