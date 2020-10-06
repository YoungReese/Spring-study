package com.ly.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 以下注解等价于配置文件中的<bean id="user" class="com.ly.pojo.User"/>
@Component
@Scope("singleton") // @Scope("prototype")
public class User {
    // 以下注解等价于配置文件中的<property name="name" value="liyang-annotation"/>
    @Value("liyang-annotation")
    public String name; // = "liyang";

    // 除了在在段上加Value，还可以在set方法上加Value，都可以实现
    // 以下注解等价于配置文件中的<property name="name" value="liyang-annotation-set"/>
    @Value("liyang-annotation-set")
    public void setName(String name) {
        this.name = name;
    }
}
