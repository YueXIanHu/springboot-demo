package com.huzh.springbootmybatispagehelper.dao;

import com.github.pagehelper.Page;
import com.huzh.springbootmybatispagehelper.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2019/9/25 16:08
 * @Author huzh
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    Page<User> getUserList();
}
