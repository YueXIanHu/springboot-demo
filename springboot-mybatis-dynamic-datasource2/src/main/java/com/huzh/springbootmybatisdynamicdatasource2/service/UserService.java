package com.huzh.springbootmybatisdynamicdatasource2.service;


import com.huzh.springbootmybatisdynamicdatasource2.entity.User;

import java.util.List;

/**
 * @author huzh
 * @date 2020/10/12 15:57
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();

    List<User> findAll2();
}
