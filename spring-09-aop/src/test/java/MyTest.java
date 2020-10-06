import com.ly.service.UserService;
import com.ly.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口：这是一个注意点
        UserService userService = context.getBean("userService", UserService.class);

        userService.create();

        userService.delete();
    }
}
