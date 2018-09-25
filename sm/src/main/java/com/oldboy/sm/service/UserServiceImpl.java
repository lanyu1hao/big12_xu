package com.oldboy.sm.service;

import com.oldboy.sm.dao.UserDao;
import com.oldboy.sm.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
   @Resource(name = "userDao")
    private UserDao dao;
    public void insertUser(User user) {
        dao.insert(user);
    }
}
