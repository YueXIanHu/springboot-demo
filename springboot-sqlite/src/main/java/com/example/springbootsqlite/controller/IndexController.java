package com.example.springbootsqlite.controller;

import com.example.springbootsqlite.entity.User;
import com.example.springbootsqlite.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author: YueXian
 * @date: 2024/3/11 15:23
 */
@RestController
public class IndexController {
    @Resource
    private UserMapper userMapper;

    /**
     * 获取所有数据
     * @return
     */
    @GetMapping
    public List<User> index(){
        return userMapper.selectList();
    }

    /**
     * 新增
     * @return
     */
    @GetMapping("/insert")
    public Object insert(){
        User user = new User();
        user.setName(randomString());
        Random random = new Random();
        user.setUid("" + random.nextInt(1000));
        user.setSex(1);
        return userMapper.insert(user);
    }

    /**
     * 获取总数
     * @return
     */
    @GetMapping("/count")
    public Object index1(){
        Long userCount = userMapper.selectCount();
        return userCount;
    }

//    /**
//     * 获取一个list集合
//     * 排序 orderByAsc("order_id")
//     * 不为null的判断 isNotNull("stove_code")
//     * 分组 groupBy("product_model")
//     * @return
//     */
//    @GetMapping("/male")
//    public Object index2(){
//        List<User> users = userMapper.selectList(new QueryWrapper<User>().eq("sex", 1));
//        return users;
//    }

//    /**
//     * 获取一个map集合
//     * @return
//     */
//    @GetMapping("/map")
//    public Object index3(){
//        List<Map<String,Object>> users = userMapper.selectMaps(new QueryWrapper<User>()
//                .select("uid,name")
//                .eq("sex", 1));
//        return users;
//    }

    /**
     * 随机生成字母
     * @param length
     * @return
     */
    public String randomString(){
        StringBuilder s = new StringBuilder(5);
        Random random = new Random();
        for( int i = 0; i < 5; i ++) {
            int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写还是小写
            s.append((char)(choice + random.nextInt(26)));
        }
        return s.toString();
    }
}
