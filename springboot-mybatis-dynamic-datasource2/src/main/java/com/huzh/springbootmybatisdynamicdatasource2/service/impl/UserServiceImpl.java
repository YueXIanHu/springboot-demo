package com.huzh.springbootmybatisdynamicdatasource2.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.huzh.springbootmybatisdynamicdatasource2.dao.UserDao;
import com.huzh.springbootmybatisdynamicdatasource2.entity.User;
import com.huzh.springbootmybatisdynamicdatasource2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huzh
 * @date 2020/10/12 15:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @DS("master")
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    @DS("sharding")
    public List<User> findAll2() {
        return userDao.selectAll();
    }


}
