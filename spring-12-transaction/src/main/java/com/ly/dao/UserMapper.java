package com.ly.dao;

import com.ly.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryUsers();

    int addUser(User user);

    int deleteUserById(@Param("id") int id);

    // 为了模拟事务创建的函数
    List<User> queryUsersInTransaction();

    int deletesUserById(@Param("id") int id);

}
