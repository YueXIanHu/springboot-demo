package com.huzh.springbootmybatisxml.mapper;

import com.huzh.springbootmybatisxml.model.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2019/8/23 11:59
 * @Author huzh
 * @Version 1.0
 */
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);

}