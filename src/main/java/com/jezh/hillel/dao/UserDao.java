package com.jezh.hillel.dao;

import com.jezh.hillel.model.UserForTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

    private UserForTest admin = context.getBean("admin", UserForTest.class);
    private UserForTest user1 = context.getBean("user1", UserForTest.class);
    private UserForTest neo = new UserForTest("neo", "kvak");
    private List<UserForTest> users = Arrays.asList(admin, user1, neo);

    public List<UserForTest> getAllUsers() {return users;}
}
