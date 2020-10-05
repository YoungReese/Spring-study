import com.ly.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * liyang 2020-10-05
 * ioc创建对象的方式，默认采用无参构造函数
 *
 * 在配置文件中可以使用3种方法实现有参构造函数来创建
 * 1、根据下标赋值
 * 2、根据类型赋值
 * 3、根据name赋值
 *
 * 总结：在配置文件加载的时候，容器中管理的对象就已经初始化了！
 *      当你需要相应的bean时，直接去getBean即可
 *
 */

public class MyTest {

    public static void main(String[] args) {
//        // 传统使用new方式
//        User user = new User();



        // 使用spring托管方式
        // 加载beans.xml，首先拿到容器context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 再从容器中获取相应的bean
        User user = (User) context.getBean("user");
        user.show();

        // 从容器中再次拿一个相应的bean
        User user2 = (User) context.getBean("user");

        // 判断两次从spring容器中获取的bean是否相同，答案是相同，说明Spring容器中只保存一份
        System.out.println(user == user2);


    }
}
