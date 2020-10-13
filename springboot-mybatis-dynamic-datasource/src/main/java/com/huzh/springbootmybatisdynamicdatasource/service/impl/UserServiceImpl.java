package com.huzh.springbootmybatisdynamicdatasource.service.impl;

import com.huzh.springbootmybatisdynamicdatasource.dao.UserDao;
import com.huzh.springbootmybatisdynamicdatasource.entity.User;
import com.huzh.springbootmybatisdynamicdatasource.service.UserService;
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
    public List<User> findAll() {
        return userDao.selectAll();
    }
}
