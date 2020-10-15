import com.ly.dao.UserMapper;
import com.ly.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * liyang 2020-10-15
 * spring整合mybatis
 *
 * 后续操作在spring-11-mybatis中进行，因为10在搭建的时候，
 * 环境一直失败，于是重新建立11，在11中一步一步搭建，
 * 通过后再来对比10，发现是db.properties没有放入mybatis-config.xml文件中
 *
 * 所以10就搁置在这里了！后续操作在11中进行！
 */
public class MyTest {

    @Test
    public void testQueryUsers() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryUsers();

        for (User user : userList) {
            System.out.println(user);
        }
    }

}
