package com.jezh.hillel.service;

import com.jezh.hillel.dao.UserDao;
import com.jezh.hillel.model.UserForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ежище on 12.07.2017.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao/* = context.getBean("userDao", UserDao.class)*/;

    public List<UserForTest> getAllUsers() {
        return userDao.getAllUsers();
    }
}
