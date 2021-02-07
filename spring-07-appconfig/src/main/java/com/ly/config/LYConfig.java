package com.ly.config;

import com.ly.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Configuration标记的类表示是一个配置类，就和我们之前看的beans.xml一样
// 这个也会被Spring容器托管，注册到容器中，因为它本来也是一个@Component（点进去看下源码可知）
@Configuration
@ComponentScan("com.ly.pojo") // 显示的去扫描，不扫描在测试的时候也通过了，但建议使用，规范化
@Import(LYConfig2.class) // 如果多个配置类配置类使用@Import组合到这里，这样对外提供这一个即可
public class LYConfig {

    // 这里注册一个bean，相当于我们之前写的一个bean标签
    // 这个方法的名字，相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean // 可以重新指定bean的id属性，比如改成user：@Bean(name="user")
    public User myUser() {
        return new User(); // 这个User对象就是要注入到bean的对象！
    }

}
