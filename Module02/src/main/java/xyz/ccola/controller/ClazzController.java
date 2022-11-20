package xyz.ccola.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import xyz.ccola.service.ClazzService;

/**
 * @ Name: ClazzController
 * @ Author: Cola
 * @ Time: 2022/11/19 23:33
 * @ Description: ClazzController 控制层
 */
@Controller(value = "ClazzController01")
@Data
@NoArgsConstructor
public class ClazzController {
    @Qualifier("clazzService01")
    private ClazzService clazzService;

    @Autowired
    public ClazzController(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    public void saveClazz() {
        clazzService.saveClazz();
    }
}
