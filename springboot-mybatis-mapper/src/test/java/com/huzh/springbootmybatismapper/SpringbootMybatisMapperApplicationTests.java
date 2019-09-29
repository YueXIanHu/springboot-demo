package com.huzh.springbootmybatismapper;

import com.huzh.springbootmybatismapper.entity.User;
import com.huzh.springbootmybatismapper.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisMapperApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectAll();
        System.out.println("=======================");
        System.out.println(users);
    }

}
