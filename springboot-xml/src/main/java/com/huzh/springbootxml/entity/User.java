package com.huzh.springbootxml.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName User
 * @Description TODO
 * @Date 2019/8/7 18:28
 * @Author huzh
 * @Version 1.0
 */
@XmlRootElement
public class User {

    String userName;
    String userAge;
    String userAddress;

    public User(String userName, String userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
