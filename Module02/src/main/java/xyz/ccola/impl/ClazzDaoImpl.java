package xyz.ccola.impl;

import org.springframework.stereotype.Repository;
import xyz.ccola.dao.ClazzDao;

/**
 * @ Name: ClazzDaoImpl
 * @ Author: Cola
 * @ Time: 2022/11/19 23:34
 * @ Description: ClazzDaoImpl
 */
@Repository(value = "clazzDao01")
public class ClazzDaoImpl implements ClazzDao {


    @Override
    public void saveClazz() {
        System.out.println("保存 Clazz");
    }
}
