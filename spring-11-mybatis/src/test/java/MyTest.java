import com.ly.dao.UserMapper;
import com.ly.pojo.User;
import com.ly.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
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

}
