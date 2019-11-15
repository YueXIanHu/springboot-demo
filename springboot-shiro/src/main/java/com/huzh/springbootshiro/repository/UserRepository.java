package com.huzh.springbootshiro.repository;

import com.huzh.springbootshiro.entity.SysUser;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2019/10/16 17:24
 * @Author huzh
 * @Version 1.0
 */
public interface UserRepository extends CrudRepository<SysUser, String> {

    //通过username查找用户信息;
    SysUser findByUserName(String username);
}