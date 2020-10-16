package com.ly.dao;

import com.ly.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * liyang 2020-10-16
 * 方式2：继承SqlSessionDaoSupport，注入的构造函数可以省略
 */

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> queryUsers() {
        return getSqlSession().getMapper(UserMapper.class).queryUsers();
    }
}