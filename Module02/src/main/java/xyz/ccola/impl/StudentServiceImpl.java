package xyz.ccola.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ccola.dao.StudentDao;
import xyz.ccola.service.StudentService;

/**
 * @ Name: StudentServiceImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 23:10
 * @ Description: StudentServiceImpl
 */
@Service
@Data
@NoArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent() {
        studentDao.saveStudent();
    }
}
