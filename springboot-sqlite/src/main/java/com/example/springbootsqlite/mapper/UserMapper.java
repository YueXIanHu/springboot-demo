package com.example.springbootsqlite.mapper;

import com.example.springbootsqlite.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: YueXian
 * @date: 2024/3/11 15:22
 */
@Mapper
public interface UserMapper {

    List<User> selectList();
    Long selectCount();

    int insert(User user);
}
