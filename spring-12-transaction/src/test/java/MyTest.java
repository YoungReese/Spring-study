import com.ly.dao.UserMapper;
import com.ly.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * liyang 2020-10-15
 * spring整合mybatis
 *
 * 使用最新版本的mysql连接java包，需要将原来的
 * driver=com.mysql.jdbc.Driver
 * 改为
 * driver=com.mysql.cj.jdbc.Driver
 *
 * 注意：不改也可以运行，只不过程序会帮助我们切换，且打印一条切换日志！
 *
 * update: 2020-10-16  spring第一次整合mybatis改造
 *
 */
public class MyTest {

    @Test
    public void testQueryUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.queryUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        int res = userMapperImpl.addUser(new User(7, "Bob", "12345"));
        if (res > 0) System.out.println("插入成功！");
    }

    @Test
    public void testDeleteUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        int res = userMapperImpl.deleteUserById(0);
        if (res > 0) System.out.println("删除成功！");
    }


}
