package com.ly.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    // 如果显示定义了Autowired的required属性为false，如果有直接注入，没有则表示忽略当前要注入的bean，跳过，不会报错
    @Autowired(required = false)
//    @Autowired()
    private Cat cat;

//    @Autowired
//    @Qualifier(value = "dog1") // 如果容器中有多个这样的对象，且没有dog时，它会分不清，这时候指定一个
    @Resource(name = "dog1") // 与上面两行注解等价
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
