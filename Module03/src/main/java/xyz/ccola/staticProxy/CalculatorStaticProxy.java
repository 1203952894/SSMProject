package xyz.ccola.staticProxy;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import xyz.ccola.Calculator;
import xyz.ccola.impl.CalculatorSimpleImpl;

/**
 * @ Name: CalculatorStaticProxy
 * @ Author: Cola
 * @ Time: 2022/11/20 8:23
 * @ Description: CalculatorStaticProxy 静态代理类
 */
@Slf4j
@Data
@NoArgsConstructor
public class CalculatorStaticProxy implements Calculator {

    /*
    将被代理的目标对象声明为成员变量
     */
    @Qualifier(value = "calculatorSimple01")
    private CalculatorSimpleImpl target;

    @Autowired
    public CalculatorStaticProxy(CalculatorSimpleImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        /*
        附加功能由代理类中的代理方法实现
         */
        log.info("add 方法开始执行：参数为 i = " + i + "j = " + j);
        /*
        通过目标对象实现核心业务逻辑
         */
        int result = target.add(i, j);
        log.info("add 方法执行完毕 结果为 " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        log.info("sub 方法开始执行：参数为 i = " + i + "j = " + j);
        int result = target.sub(i, j);
        log.info("sub 方法执行完毕 结果为 " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        log.info("mul 方法开始执行：参数为 i = " + i + "j = " + j);
        int result = target.mul(i, j);
        log.info("mul 方法执行完毕 结果为 " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        log.info("div 方法开始执行：参数为 i = " + i + "j = " + j);
        int result = target.div(i, j);
        log.info("div 方法执行完毕 结果为 " + result);
        return result;
    }
}
