package xyz.ccola.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.ccola.service.UserService;

/**
 * @ Name: UserController
 * @ Author: Cola
 * @ Time: 2022/11/19 21:05
 * @ Description: UserController 控制层
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    private UserService userService;


    /**
     * 保存用户
     */
    public void saveUser() {
        userService.saveUser();
    }
}
