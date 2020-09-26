package com.ly.service;

import com.ly.dao.UserDao;
import com.ly.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    // 通过组合在service层调用dao层
    private UserDao userDao;

    // 利用set进行动态实现值得注入，这里类似于UserDao相关类的多态
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
