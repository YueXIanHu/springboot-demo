package com.huzh.springbootmybatisdynamicdatasource2.dao;


import com.huzh.springbootmybatisdynamicdatasource2.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 查询全部用户
     * @return
     */
    List<User> selectAll();
}