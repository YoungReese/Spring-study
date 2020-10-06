import com.ly.service.UserService;
import com.ly.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liyang 2020-10-07
 * 测试AOP的两种实现方式
 */

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口：这是一个注意点，代理（Proxy）由Spring来帮我们搞定
        UserService userService = context.getBean("userService", UserService.class);

        userService.create();
        System.out.println();
        userService.delete();
    }
}
