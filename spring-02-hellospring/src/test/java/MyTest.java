import com.ly.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下问对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中进行管理了，我们要使用，直接去里面取出来就可以
        // 方式1
        Hello hello = (Hello) context.getBean("hello"); // 使用bean的id
        System.out.println(hello.toString());
        // 方式2
        Hello hello2 = context.getBean(Hello.class); // 直接使用类名.class
        System.out.println(hello2);
    }
}
