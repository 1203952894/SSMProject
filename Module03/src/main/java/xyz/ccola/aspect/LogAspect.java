package xyz.ccola.aspect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ Name: LogAspect
 * @ Author: Cola
 * @ Time: 2022/11/20 14:22
 * @ Description: LogAspect 切面类
 */
@Aspect
@Component
@Data
@AllArgsConstructor
@Slf4j
public class LogAspect {

    @Pointcut("execution(public int xyz.ccola.impl.CalculatorPureImpl.*(..))")
    public void pointcut() {

    }

    @Before("execution(public int xyz.ccola.impl.CalculatorPureImpl.*(..))")
    public void beforeMethod(@NotNull JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        log.info("{}方法开始执行：参数为{}", name, args);
    }

    @After("execution(public int xyz.ccola.impl.CalculatorPureImpl.*(..))")
    public void afterMethod(@NotNull JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("{}方法执行结束", name);
    }

    @AfterReturning(value = "execution(public int xyz.ccola.impl.CalculatorPureImpl.*(..))"
            , returning = "result")
    public void afterReturningMethod(@NotNull JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        log.info("{}方法执行成功，返回值为：{}", name, result);
    }

    @AfterThrowing(value = "execution(public int xyz.ccola.impl.CalculatorPureImpl.*(..))"
            , throwing = "ex")
    public void afterThrowingMethod(@NotNull JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        log.info("{}方法执行出错，异常类型为：{}", name, ex);
    }

    @Around(value = "pointcut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            log.info("{}方法开始执行：参数为{}", name, args);
            result = joinPoint.proceed();
            log.info("{}方法执行成功，返回值为：{}", name, result);
        } catch (Throwable throwable) {
            if (log.isDebugEnabled()) {
                log.error("{}方法执行出错，异常类型为：{}", name, throwable);
            }
        } finally {
            log.info("{}方法执行结束", name);
        }
        return result;
    }

}
