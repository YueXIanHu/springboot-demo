package com.huzh.springbootjpamulidatasource.controller;

import com.huzh.springbootjpamulidatasource.entity.primary.City;
import com.huzh.springbootjpamulidatasource.entity.secondary.House;
import com.huzh.springbootjpamulidatasource.repository.primary.CityRepository;
import com.huzh.springbootjpamulidatasource.repository.secondary.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Date 2019/8/28 19:00
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    HouseRepository houseRepository;

    @GetMapping("/testDataSource")
    public String testDataSource() {
        City city = new City("北京", "中国首都");
        cityRepository.save(city);
        return "success";
    }

    @GetMapping("/testDataSource2")
    public String testDataSource2() {
        House house = new House("豪宅", "特别大的豪宅");
        houseRepository.save(house);
        return "success";
    }

}