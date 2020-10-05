package com.ly.pojo;

/**
 * liyang 2020-10-05
 * 在beans.xml中的bean标签使用别名然后在MyTest中进行测试
 * 这个类的内容直接拷贝User中的内容，打印内容稍微改一下即可
 */

public class UserAlias {

    private String name;

    public UserAlias() {
        System.out.println("UserAlias的无参构造函数！");
    }

    public UserAlias(String name) {
        this.name = name;
        System.out.println("UserAlias的有参构造函数！");
    }

    public UserAlias(String name, String str) {
        this.name = name;
        System.out.println("UserAlias的有参构造函数2！");
        System.out.println(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name: " + name);
    }

}
