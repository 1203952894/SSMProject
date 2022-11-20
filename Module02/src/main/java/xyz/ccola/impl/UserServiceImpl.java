package xyz.ccola.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.ccola.dao.UserDao;
import xyz.ccola.service.UserService;

/**
 * @ Name: UserServiceImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 21:08
 * @ Description: UserServiceImpl
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService {
    private UserDao userDao;


    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
