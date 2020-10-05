import com.ly.dao.*;
import com.ly.service.UserService;
import com.ly.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liyang 2020-09-26
 * 我们原来的程序是在service主动穿件实现类对象，控制权在程序员手中
 *
 * 客户端的需求改变，程序员都需要手动更改相应的实现类，程序庞大时，更改的代价非常高
 *
 * 现在使用set进行注入，掌握权来到客户端手中，客户端需要什么，自己动态set设置进去，然后调用相关实现类
 *
 * 这就是控制反转的思想 (IOC)，本例是IOC的原型！
 *
 * 这种思想下，从本质上解决了问题，我们程序员不用再去管理对象的创建了，系统耦合性大大降低
 *
 * 扩展新的类非常方便（dao层直接扩展），不需要更改service层的代码，使我们更加专注于业务逻辑实现，符合OCP原则
 */
public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层他们不需要接触
        UserServiceImpl userService = new UserServiceImpl();

        //userService.setUserDao(new UserDaoImpl());
        //userService.setUserDao(new UserDaoMysqlImpl());
        //userService.setUserDao(new UserDaoOracleImpl());
        userService.setUserDao(new UserDaoSqlserverImpl());
        userService.getUser();



        // 学习完spring-02-hellospring后来改造上述代码
        // 改造后test with Spring
        // 获取ApplicationContext，拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手，天下我有，需要什么就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }

}
