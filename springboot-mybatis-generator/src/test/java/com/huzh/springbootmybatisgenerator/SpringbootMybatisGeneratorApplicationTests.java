package com.huzh.springbootmybatisgenerator;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huzh.springbootmybatisgenerator.dao.UserMapper;
import com.huzh.springbootmybatisgenerator.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisGeneratorApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println("====================");
        PageHelper.startPage(1, 2);
        Page<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }

}
