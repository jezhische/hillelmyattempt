package com.jezh.hillel.dao;

import com.jezh.hillel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ежище on 12.07.2017.
 */
@Repository
//@ComponentScan("com.jezh.hillel.beans")
public class UserDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");

    private User admin = context.getBean("admin", User.class);
    private User user1 = context.getBean("user1", User.class);
    private User neo = new User("neo", "kvak");
    private List<User> users = Arrays.asList(admin, user1, neo);

    public List<User> getAllUsers() {return users;}
}
