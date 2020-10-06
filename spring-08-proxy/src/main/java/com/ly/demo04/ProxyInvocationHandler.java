package com.ly.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * liyang 2020-10-07
 * 使用这个类自动生成代理类
 *
 * 改造demo03动态代理类，使其更加通用化，以后用的时候甚至可以当作一个工具类使用
 *
 * 改造完之后，使用它动态代理demo02的相关操作
 *
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 公共部分，直接拿来用

    // 被代理的接口，实际传进来的是它的实现类，可以使用构造器传入或者set传入
    private Object target;

    // 通过set设置进来
    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类  [command + p : 参数提示]
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());

        // 动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(target, args);
        return result;
    }


    // 专有部分，根据需求自己增加，然后放入invoke函数的适当位置
    // 增加一个日志功能
    public void log(String msg) {
        System.out.println("[Debug] 执行了" + msg + "方法");
    }
}
