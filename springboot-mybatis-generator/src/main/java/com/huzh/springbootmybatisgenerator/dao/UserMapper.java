package com.huzh.springbootmybatisgenerator.dao;

import com.github.pagehelper.Page;
import com.huzh.springbootmybatisgenerator.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    Page<User> selectAll();

    int updateByPrimaryKey(User record);
}