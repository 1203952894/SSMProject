import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.Calculator;
import xyz.ccola.factory.ProxyFactory;
import xyz.ccola.impl.CalculatorLogImpl;
import xyz.ccola.impl.CalculatorSimpleImpl;
import xyz.ccola.staticProxy.CalculatorStaticProxy;
import xyz.ccola.utils.ApplicationContextUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ Name: CalculatorTest
 * @ Author: Cola
 * @ Time: 2022/11/20 8:11
 * @ Description: CalculatorTest 测试类
 */
@Slf4j
public class CalculatorTest {

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
     * 测试 CalculatorSimple
     */
    @Test
    public void calculatorSimpleImplTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        CalculatorSimpleImpl calculatorSimple01 = (CalculatorSimpleImpl) context.getBean("calculatorSimple01");
        calculatorSimple01.add(1, 1);
        log.info("方法 calculatorSimpleImplTest 测试通过");
    }

    /**
     * 测试 CalculatorSimple
     */
    @Test
    public void calculatorLogImplTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        CalculatorLogImpl calculatorLog01 = (CalculatorLogImpl) context.getBean("calculatorLog01");
        calculatorLog01.add(1, 1);
        log.info("方法 calculatorLogImplTest 测试通过");
    }

    /**
     * 测试 CalculatorStaticProxy
     */
    @Test
    public void calculatorStaticProxyTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        CalculatorStaticProxy calculatorStaticProxy01 = (CalculatorStaticProxy) context.getBean("calculatorStaticProxy01");
        calculatorStaticProxy01.add(1, 1);
        log.info("方法 calculatorStaticProxyTest 测试通过");
    }

    /**
     * 测试 ProxyFactory
     */
    @Test
    public void proxyFactoryTest() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorSimpleImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 1);
        log.info("方法 proxyFactoryTest 测试通过");
    }


}
