package com.ly.demo02;

/**
 * 真是角色
 */
public class UserServiceImpl implements UserService {

    public void creat() {
        System.out.println("增加了一个用户");
    }

    public void retrieve() {
        System.out.println("查询了一个用户啊");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }
}
