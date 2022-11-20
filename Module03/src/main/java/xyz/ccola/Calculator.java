package xyz.ccola;

/**
 * @ Name: Calculator
 * @ Author: Cola
 * @ Time: 2022/11/20 8:08
 * @ Description: Calculator 接口
 */
public interface Calculator {

    /**
     * 加法
     *
     * @param i i
     * @param j j
     * @return i+j
     */
    int add(int i, int j);

    /**
     * 减法
     *
     * @param i i
     * @param j j
     * @return i-j
     */
    int sub(int i, int j);

    /**
     * 乘法
     *
     * @param i i
     * @param j j
     * @return i*j
     */
    int mul(int i, int j);

    /**
     * 除法
     *
     * @param i i
     * @param j j
     * @return i/j
     */
    int div(int i, int j);
}
