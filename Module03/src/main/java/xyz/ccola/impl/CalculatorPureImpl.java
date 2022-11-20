package xyz.ccola.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import xyz.ccola.Calculator;

/**
 * @ Name: CalculatorPureImpl
 * @ Author: Cola
 * @ Time: 2022/11/20 14:19
 * @ Description: CalculatorPureImpl 实现类
 */
@Component
@Slf4j
@Data
@AllArgsConstructor
public class CalculatorPureImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        System.out.println("方法内部，结果为： " + (i + j));

        return i + j;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("方法内部，结果为： " + (i - j));

        return i - j;
    }

    @Override
    public int mul(int i, int j) {

        System.out.println("方法内部，结果为： " + (i * j));

        return i * j;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("方法内部，结果为： " + (i / j));

        return i / j;
    }
}
