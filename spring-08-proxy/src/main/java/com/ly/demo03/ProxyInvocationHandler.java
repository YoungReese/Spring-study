package com.ly.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用这个类自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口，实际传进来的是它的实现类，可以使用构造器传入或者set传入
    private Rent rent;

    // 通过set设置进来
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类  [command + p : 参数提示]
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
        // 直接使用这个方式也行，与上条语句等价
        // return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Rent.class}, this);
    }


    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();

        // 动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(rent, args);

        signContract();

        agencyFee();

        return result;
    }


    // 看房子
    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    // 签合同
    public void signContract() {
        System.out.println("签租赁合同");
    }

    // 收中介费
    public void agencyFee() {
        System.out.println("收中介费");
    }


}
