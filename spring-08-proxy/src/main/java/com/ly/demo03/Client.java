package com.ly.demo03;

/**
 * liyang 2020-10-06
 * 测试动态代理
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Landlord landlord = new Landlord();

        // 代理角色：暂时没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要的接口对象！
        pih.setRent(landlord);
        Rent proxy = (Rent) pih.getProxy(); // 这里的proxy就是动态生成的
        proxy.rent();


    }
}
