package xyz.ccola.impl;

import org.springframework.stereotype.Repository;
import xyz.ccola.dao.StudentDao;

/**
 * @ Name: StudentDaoImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 23:08
 * @ Description: StudentDaoImpl
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public void saveStudent() {
        System.out.println("保存 Student");

    }
}
