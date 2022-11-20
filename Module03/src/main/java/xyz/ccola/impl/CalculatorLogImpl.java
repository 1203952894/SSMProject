package xyz.ccola.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import xyz.ccola.Calculator;

/**
 * @ Name: CalculatorLogImpl
 * @ Author: Cola
 * @ Time: 2022/11/20 8:10
 * @ Description: CalculatorLogImpl 实现类
 */
@Slf4j
@Data
@AllArgsConstructor
public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        log.info("add 方法开始执行：参数为 i = " + i + "j = " + j);
        System.out.println("方法内部，结果为： " + (i + j));
        log.info("add 方法执行完毕 结果为 " + (i + j));
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        log.info("sub 方法开始执行：参数为 i = " + i + "j = " + j);
        System.out.println("方法内部，结果为： " + (i - j));
        log.info("sub 方法执行完毕 结果为 " + (i - j));
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        log.info("mul 方法开始执行：参数为 i = " + i + "j = " + j);
        System.out.println("方法内部，结果为： " + (i * j));
        log.info("mul 方法执行完毕 结果为 " + (i * j));
        return i * j;
    }

    @Override
    public int div(int i, int j) {
        log.info("div 方法开始执行：参数为 i = " + i + "j = " + j);
        System.out.println("方法内部，结果为： " + (i / j));
        log.info("div 方法执行完毕 结果为 " + (i / j));
        return i / j;
    }
}
