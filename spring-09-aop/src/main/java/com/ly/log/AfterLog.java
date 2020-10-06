package com.ly.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 方式1：使用Spring的API接口
 * 后置通知
 */

public class AfterLog implements AfterReturningAdvice {
    // returnValue: 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println(method.getName() + "方法被执行了！"
                + "返回的结果为：" + returnValue);
    }
}
