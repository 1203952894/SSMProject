package xyz.ccola.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import xyz.ccola.bean.User;

/**
 * @ Name: UserFactoryBean
 * @ Author: Cola
 * @ Time: 2022/11/19 21:00
 * @ Description: UserFactoryBean
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
