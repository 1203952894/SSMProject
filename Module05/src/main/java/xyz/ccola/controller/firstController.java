package xyz.ccola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Name: firstController
 * @ Author: Cola
 * @ Time: 2022/11/20 16:37
 * @ Description: firstController
 */
@Controller
@RequestMapping("/firstController")
public class firstController {
  
    @RequestMapping("/sayhello01")
    public String sayhello01() {
        System.out.println("sayhello01");
        return "success";
    }

    @RequestMapping("/sayhello02")
    public String sayhello02() {
        System.out.println("sayhello02");
        return "success";
    }

}
