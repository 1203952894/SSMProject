package xyz.ccola.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ Name: MyBeanProcessor
 * @ Author: Cola
 * @ Time: 2022/11/19 20:57
 * @ Description: MyBeanProcessor Bean 的后置处理器
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期 3：Bean 的后置处理器在初始化前的操作 ：");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期 5：Bean 的后置处理器在初始化后的操作 ：");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
