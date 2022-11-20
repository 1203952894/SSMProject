import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.bean.Clazz;
import xyz.ccola.bean.HelloWorld;
import xyz.ccola.bean.Student;
import xyz.ccola.utils.ApplicationContextUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @ Name: BeanTest
 * @ Author: Cola
 * @ Time: 2022/11/19 20:16
 * @ Description: BeanTest 测试类
 */
@Slf4j
public class BeanTest {

    /**
     * 测试 Druid 数据库连接
     */
    @Test
    public void druidDataBaseConnectionTest() throws SQLException {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        DataSource dataSource = (DataSource) context.getBean("druidDataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        log.info("方法：druidDataBaseConnectionTest 测试通过，已获取到连接：" + connection);
    }

    /**
     * 测试 获取 HelloWorld Bean
     */
    @Test
    public void getHelloWorldBeanTest() {
        /*
        通过读取类路径下的 XML 配置创建 IOC容器对象 ClassPathXmlApplicationContext
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        /*
        根据 Bean 的 id 获取 Bean 对象
         */
        HelloWorld helloWorld01 = (HelloWorld) context.getBean("helloWorld01");

        /*
        执行 HelloWorld 中的 main 方法
         */
        helloWorld01.main(null);
        log.info("方法：getHelloWorldBeanTest 测试通过");

    }

    /**
     * 测试 依赖注入之 setter 注入
     */
    @Test
    public void setterDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student01 = (Student) context.getBean("Student01");
        System.out.println(student01.toString());
        log.info("方法：setterDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 特殊值 null 小于号 「<」 的处理
     */
    @Test
    public void nullDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student02 = (Student) context.getBean("Student02");
        Student student03 = (Student) context.getBean("Student03");
        Student student04 = (Student) context.getBean("Student04");
        System.out.println(student02.toString());
        System.out.println(student03.toString());
        System.out.println(student04.toString());
        log.info("方法：nullDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为类属性赋值
     */
    @Test
    public void setterClassPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student05 = (Student) context.getBean("Student05");
        Student student06 = (Student) context.getBean("Student06");
        Student student07 = (Student) context.getBean("Student07");
        System.out.println(student05.toString());
        System.out.println(student06.toString());
        System.out.println(student07.toString());
        log.info("方法：setterClassPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为数组属性赋值
     */
    @Test
    public void setterArrayPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student08 = (Student) context.getBean("Student08");
        System.out.println(student08.toString());
        log.info("方法：setterArrayPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为集合属性赋值
     */
    @Test
    public void setterSetPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Clazz clazz02 = (Clazz) context.getBean("Clazz02");
        System.out.println(clazz02.toString());
        log.info("方法：setterSetPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为 Map 属性赋值
     */
    @Test
    public void setterMapPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student09 = (Student) context.getBean("Student09");
        System.out.println(student09.toString());
        log.info("方法：setterMapPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 构造器 注入
     */
    @Test
    public void constructorDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student10 = (Student) context.getBean("Student10");
        System.out.println(student10.toString());
        log.info("方法：constructorDependencyInjectionTest 测试通过");
    }


}
