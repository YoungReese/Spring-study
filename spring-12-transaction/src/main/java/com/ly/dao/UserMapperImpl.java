package com.ly.dao;

import com.ly.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * liyang 2020-10-16
 * 继承SqlSessionDaoSupport，注入的构造函数可以省略
 */

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> queryUsers() {
        return getSqlSession().getMapper(UserMapper.class).queryUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
    }


    // 为了模拟事务创建的函数
    @Override
    public List<User> queryUsersInTransaction() {

        User user = new User(8, "Jobs", "1955");
        addUser(user);
        deletesUserById(55);
        return getSqlSession().getMapper(UserMapper.class).queryUsersInTransaction();
    }

    @Override
    public int deletesUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).deletesUserById(id);
    }
}