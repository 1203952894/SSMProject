package xyz.ccola.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

/**
 * @ Name: ContextUtil
 * @ Author: Cola
 * @ Time: 2022/11/19 20:18
 * @ Description: Context 工具类
 */
public class ApplicationContextUtil {

    public static ClassPathXmlApplicationContext getClassPathXmlApplicationContext() {
                /*
        通过读取类路径下的 XML 配置创建 IOC容器对象 ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        return Objects.requireNonNull(context);
    }
}
