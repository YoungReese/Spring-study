package com.ly.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    // Spring建议使用set方法注入进来，因为一份代理，可以多次使用
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void creat() {
        log("creat");
        userService.creat();
    }

    public void retrieve() {
        log("retrieve");
        userService.retrieve();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    // 增加一个打印日志的方法
    public void log(String msg) {
        System.out.println("[Debug] 使用了" + msg + "方法");
    }


    // 记住：在没有充足了解公司原有的业务代码情况下，改动它是大忌！
    //      即使完全了解，在没有清晰的规划下，也不要去修改！
}
