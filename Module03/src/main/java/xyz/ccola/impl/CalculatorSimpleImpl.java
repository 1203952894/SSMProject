package xyz.ccola.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import xyz.ccola.Calculator;

/**
 * @ Name: CalculatorImpl
 * @ Author: Cola
 * @ Time: 2022/11/20 8:09
 * @ Description: CalculatorImpl 实现类
 */

@Data
@AllArgsConstructor
public class CalculatorSimpleImpl implements Calculator {
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
