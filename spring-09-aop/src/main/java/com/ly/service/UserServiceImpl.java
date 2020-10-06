package com.ly.service;

/**
 * 被通知的对象就是目标（Target）
 */
public class UserServiceImpl implements UserService {
    public void create() {
        System.out.println("增加了一个用户");
    }

    public void retrieve() {
        System.out.println("查询了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }
}
