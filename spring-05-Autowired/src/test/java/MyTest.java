import com.ly.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liyang 2020-10-06
 */

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);

        System.out.println(people.toString());
//        people.getCat().shout(); // 这里注释掉是因为这里测试加载情况，加载测试成功，但是使用则会出错，因为实际没有注入
//        people.getDog().shout();
    }
}
