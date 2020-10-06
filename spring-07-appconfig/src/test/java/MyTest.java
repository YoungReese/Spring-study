import com.ly.config.LYConfig;
import com.ly.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * liyang 2020-10-06
 * 测试使用JavaConfig实现配置
 *
 * 使用AnnotationConfigApplicationContext，在使用getBean的时候需要使用方法名
 */


public class MyTest {
    public static void main(String[] args) {
        // 完全使用配置类的方式去实现注入，我们就只能通过AnnotationConfigContext来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(LYConfig.class);
        User user = (User) context.getBean("myUser"); // myUser是java配置类中的方法名
        System.out.println(user.getName());
    }
}
