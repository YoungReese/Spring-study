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
 * update: 2020-10-16  spring第二次整合mybatis改造
 *
 * 注意：提交代码的时候，P25漏掉了，写成了P26，P26写成了P27，P27在原来基础上加了-code
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

    /**
     * liyang 2020-10-17
     * 这里测试模拟事务，在插入中函数中嵌入删除，并且删除的sql语句delete改成deletes模拟失败，
     * 观察在配置与不配置事务的情况下数据库数据。（注：这个测试注定有报错，因为deletes是错误的）
     *
     * 结论：有事务情况，数据不会被插入； （事务的回滚操作）
     *      没有事务情况，数据会被插入。 （不存在回滚操作）
     */
    @Test
    public void testQueryUsersInTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.queryUsersInTransaction();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
