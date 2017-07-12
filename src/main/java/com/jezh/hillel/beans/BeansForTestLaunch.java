package com.jezh.hillel.beans;

import com.jezh.hillel.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.jezh.hillel.model.User;

/**
 * Created by WORK_x64 on 11.07.2017.
 */
@Configuration
public class BeansForTestLaunch {

    @Bean
//    @Scope(value = "prototype")
    public User admin() {
        return new User("admin", "admin");
    }

    @Bean
//    @Scope(value = "prototype")
    public User user1() {
        return new User("user1", "user1");
    }

    @Bean
//    @Scope(value = "prototype")
    public UserDao userDao() {
        return new UserDao();
    }

}
