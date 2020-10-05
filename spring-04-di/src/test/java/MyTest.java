import com.ly.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * liyang 2020-10-05
 * 对常用注入方式的测试
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
