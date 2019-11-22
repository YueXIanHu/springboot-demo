package com.huzh.springbootmongodb.repositiry;

import com.huzh.springbootmongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Date 2019/11/22 10:50
 * @Author huzh
 * @Version 1.0
 */
public interface UserRepository extends MongoRepository<User, Long> {
}
