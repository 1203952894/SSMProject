package xyz.ccola.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xyz.ccola.service.StudentService;

/**
 * @ Name: StudentController
 * @ Author: Cola
 * @ Time: 2022/11/19 23:07
 * @ Description: StudentController 控制层
 */
@Controller(value = "StudentController01")
@Data
@NoArgsConstructor
public class StudentController {
    
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void saveStudent() {
        studentService.saveStudent();
    }
}
