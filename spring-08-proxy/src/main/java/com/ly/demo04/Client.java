package com.ly.demo04;

import com.ly.demo02.UserService;
import com.ly.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService); // 设置要代理的对象
        UserService proxy = (UserService) pih.getProxy(); // 动态生成代理类
        // 通过代理类调用相关方法
        proxy.create();
        proxy.retrieve();
        proxy.update();
        proxy.delete();
    }
}
