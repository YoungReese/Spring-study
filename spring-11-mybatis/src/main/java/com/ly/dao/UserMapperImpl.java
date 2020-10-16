package com.ly.dao;

import com.ly.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    // 在原来，我们都使用sqlSession来执行，使用spring整合后，我们使用sqlSessionTemplate，本质一样，就相当于换个名字
    // 在mybatis中习惯了使用sqlSession，所以使用变量名sqlSession，而不是用sqlSessionTemplate，当然你也可以使用这个名字，这取决于你
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryUsers() {
        return sqlSession.getMapper(UserMapper.class).queryUsers();
    }

}
