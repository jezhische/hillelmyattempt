package com.jezh.hillel.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Ежище on 12.07.2017.
 */
@Component
public class UserForTest {

    private String name;

    private String password;

    public UserForTest() {
    }

    public UserForTest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserForTest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
