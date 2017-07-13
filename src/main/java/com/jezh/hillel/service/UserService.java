package com.jezh.hillel.service;

import com.jezh.hillel.dao.UserDao;
import com.jezh.hillel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ежище on 12.07.2017.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao/* = context.getBean("userDao", UserDao.class)*/;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
