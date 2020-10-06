package com.ly.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式3：使用注解实现AOP
 */

// 标注这是一个切面
@Aspect
public class AnnotationPointcut {

    @Before("execution(* com.ly.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行前-annotation====");
    }

    @After("execution(* com.ly.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("====方法执行后-annotation====");
    }

    // 在环绕增强中，我门可以给定一个参数，代表我们要获取处理的切入点
    @Around("execution(* com.ly.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        // 下面三句是核心语句
        System.out.println("环绕前");
        Object proceed = jp.proceed(); // 执行方法
        System.out.println("环绕后");

        // 以下语句不是核心语句，可有可无
        Signature signature = jp.getSignature();// 获得签名
        System.out.println("signature：" + signature);
        System.out.println(proceed);
    }

}
