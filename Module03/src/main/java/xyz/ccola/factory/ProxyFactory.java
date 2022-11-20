package xyz.ccola.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ Name: ProxyFactory
 * @ Author: Cola
 * @ Time: 2022/11/20 9:21
 * @ Description: ProxyFactory 动态代理类
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProxyFactory {

    /*
    将被代理的目标对象声明为成员变量
     */
    private Object target;


    public Object getProxy() {

        /*
        加载动态生成的代理类的类加载器
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        /*
        获取目标对象实现的所有接口的 class 对象并存入数组中
         */
        Class<?>[] interfaces = target.getClass().getInterfaces();
        /*
        设置代理对象实现目标对象方法的过程，即代理类如何重写接口中的抽象方法
         */
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象 the proxy instance that the method was invoked on
             *
             *
             * @param method 代理对象需要实现的方法 ，即其中需要重写的方法 the {@code Method} instance corresponding to
             * the interface method invoked on the proxy instance.  The declaring
             * class of the {@code Method} object will be the interface that
             * the method was declared in, which may be a superinterface of the
             * proxy interface that the proxy class inherits the method through.
             *
             * @param args 方法所对应的参数 an array of objects containing the values of the
             * arguments passed in the method invocation on the proxy instance,
             * or {@code null} if interface method takes no arguments.
             * Arguments of primitive types are wrapped in instances of the
             * appropriate primitive wrapper class, such as
             * {@code java.lang.Integer} or {@code java.lang.Boolean}.
             *
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;

                try {
                    log.info(method.getName() + " 方法开始执行：参数为 " + Arrays.toString(args));
                    result = method.invoke(target, args);
                } catch (Exception e) {
                    e.printStackTrace();
                    log.info(method.getName() + " 方法出现异常 异常为： " + e.getMessage());
                } finally {
                    log.info(method.getName() + " 方法执行完毕 结果为 " + result);
                }
                return result;
            }
        };

        /*
        创建一个代理实例并返回
         */
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}

