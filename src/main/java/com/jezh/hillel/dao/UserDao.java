package com.jezh.hillel.dao;

import com.jezh.hillel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ежище on 12.07.2017.
 */
@Repository
public class UserDao {
    @Autowired
    private User admin, user1;
    private List<User> users = Arrays.asList(admin, user1);

    public List<User> getAllUsers() {return users;}
}
