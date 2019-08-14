package com.huzh.springboottransactional.controller;

import com.huzh.springboottransactional.entity.House;
import com.huzh.springboottransactional.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;


/**
 * @ClassName HouseController
 * @Description TODO
 * @Date 2019/8/6 13:29
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    @GetMapping("/test1")
    public String test1() {
        houseRepository.save(new House("house1", "100平方米"));
        houseRepository.save(new House("house2", "100平方米"));
        houseRepository.save(new House("house3", "100平方米"));
        houseRepository.save(new House("house444444444", "100平方米"));
        houseRepository.save(new House("house5", "100平方米"));
        return "success";
    }

    @GetMapping("/test2")
    @Transactional
    public String test2() {
        houseRepository.save(new House("house6", "100平方米"));
        houseRepository.save(new House("house7", "100平方米"));
        houseRepository.save(new House("house8", "100平方米"));
        houseRepository.save(new House("house999999999", "100平方米"));
        houseRepository.save(new House("house10", "100平方米"));
        return "success";
    }
}
