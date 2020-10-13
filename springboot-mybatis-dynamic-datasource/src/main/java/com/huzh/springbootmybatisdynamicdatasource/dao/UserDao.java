package com.huzh.springbootmybatisdynamicdatasource.dao;

import com.huzh.springbootmybatisdynamicdatasource.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 查询全部用户
     * @return
     */
    List<User> selectAll();
}