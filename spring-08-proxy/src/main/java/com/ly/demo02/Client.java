package com.ly.demo02;

/**
 * liyang 2020-10-06
 * 客户端测试
 */

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.creat();
        userService.retrieve();
        userService.update();
        userService.delete();
        System.out.println();

        // 使用代理类增加了一个打印日志的方法且不修改原有的代码
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.creat();
        userServiceProxy.retrieve();
        userServiceProxy.update();
        userServiceProxy.delete();

    }
}
