package com.huzh.springbootswagger.repository;

import com.huzh.springbootswagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2019/8/29 17:07
 * @Author huzh
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);
}
