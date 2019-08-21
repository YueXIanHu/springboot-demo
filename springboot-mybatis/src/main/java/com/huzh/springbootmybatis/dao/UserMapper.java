package com.huzh.springbootmybatis.dao;

import com.huzh.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2019/8/21 12:18
 * @Author huzh
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    User findUserByUsername(String username);

    void updateUserByUsername(User user);

    void deleteUserByUsername(String username);

    void saveUser(User user);

    List<User> getUserList();
}
