package xyz.ccola.impl;

import xyz.ccola.dao.UserDao;

/**
 * @ Name: UserDaoImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 21:08
 * @ Description: UserDaoImpl
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存 User");
    }
}
