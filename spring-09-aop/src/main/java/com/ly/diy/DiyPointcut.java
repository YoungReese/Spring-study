package com.ly.diy;

/**
 * 这个模块化的特殊对象就叫做切面（Aspect）
 * 里面的方法就叫做通知（Advice）
 */

public class DiyPointcut {

    public void before() {
        System.out.println("======方法执行前======");
    }

    public void after() {
        System.out.println("======方法执行后======");
    }

}
