import com.ly.pojo.Student;
import com.ly.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liyang 2020-10-05
 * 对常用注入方式的测试
 *
 * 注入方式：
 * 1、构造器注入
 *
 * 2、set注入
 *
 * 3、拓展注入（相对于上述注入，在xml文件中需要引入相关约束）
 * p-namespace注入对应set注入，需要由set函数
 * c-namespace注入对应construct注入，需要有构造函数
 *
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAddress());

        System.out.println();
        System.out.println(student.toString()); // mark
    }


    // 测试p-namespace或者c-namespace注入
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        // 使用以下方式，在getBean的时候，直接告诉容器，返回什么类型，可以避免强转
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}

// mark
// Student{name='liyang',
//         address=Address{address='earth'},
//         books=[红楼梦, 西游记, 水浒传, 三国志],
//         hobby=[听歌, 敲代码, 看电影],
//         card={身份证=007, 银行卡=996},
//         games=[lol, 穿越火线],
//         wife='null',
//         info={
//               学号=20201005,
//               性别=男,
//               password=123456,
//               url=https://github.com,
//               driver=git,
//               username=root
//               }
//         }
