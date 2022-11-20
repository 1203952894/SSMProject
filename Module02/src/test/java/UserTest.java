import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.bean.User;
import xyz.ccola.controller.UserController;
import xyz.ccola.utils.ApplicationContextUtil;

/**
 * @ Name: UserTest
 * @ Author: Cola
 * @ Time: 2022/11/19 20:51
 * @ Description: UserTest 测试类
 */
@Slf4j
public class UserTest {

    /**
     * 测试 Bean 的作用域  Singleton And Prototype
     */
    @Test
    public void singletonAndPrototypeTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        /*
        Singleton
         */
        User userSingleton01 = (User) context.getBean("User01");
        User userSingleton02 = (User) context.getBean("User01");
        /*
        Prototype
         */
        User userPrototype01 = (User) context.getBean("User02");
        User userPrototype02 = (User) context.getBean("User02");

        System.out.println(userSingleton01 == userSingleton02);
        log.info("对象：" + userSingleton01 + " 和对象：" + userSingleton02 + " 内存地址相同");
        System.out.println(userPrototype01 == userPrototype02);
        log.info("对象：" + userPrototype01 + " 和对象：" + userPrototype02 + " 内存地址不同");
        log.info("方法：singletonAndPrototypeTest 测试通过");
    }

    /**
     * 测试 Bean 的生命周期
     */
    @Test
    public void beanLiveTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        User user03 = (User) context.getBean("User03");
        System.out.println("生命周期 6：Bean 对象就绪");
        context.close();
        log.info("方法：beanLiveTest 测试通过");
    }

    /**
     * 测试 UserFactoryBean
     */
    @Test
    public void userFactoryBeanTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        User user = (User) context.getBean("UserFactoryBean01");
        System.out.println(user.toString());
        log.info("方法：userFactoryBeanTest 测试通过");
    }

    /**
     * 测试 基于 XML 的自动装配之 byType
     */
    @Test
    public void autowiredXmlByTypeTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        UserController userController01 = (UserController) context.getBean("UserController01");
        userController01.saveUser();
        log.info("方法：autowiredXmlByTypeTest 测试通过");
    }
    
}
