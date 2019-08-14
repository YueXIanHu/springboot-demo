package com.huzh.springbootcache.controller;

import com.huzh.springbootcache.entity.House;
import com.huzh.springbootcache.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HouseController
 * @Description TODO
 * @Date 2019/8/5 15:53
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    //http://localhost:8080/saveHouse?id=1&houseName=别墅&houseSize=1220平方米
    @GetMapping("/saveHouse")
    @CachePut(value = "house", key = "#id")
    public House saveHouse(Integer id, String houseName, String houseSize) {
        House house = new House(id, houseName, houseSize);
        houseRepository.save(house);
        return house;
    }

    //http://localhost:8080/queryHouse?id=1
    @GetMapping("/queryHouse")
    @Cacheable(value = "house", key = "#id")
    public House queryHouse(Integer id) {
        House house = houseRepository.getOne(id);
        return house;
    }

    //http://localhost:8080/deleteHouse?id=1
    @GetMapping("/deleteHouse")
    @CacheEvict(value = "house", key = "#id")
    public String deleteHouse(Integer id) {
        houseRepository.deleteById(id);
        return "success";
    }

    //http://localhost:8080/deleteCache
    @GetMapping("/deleteCache")
    @CacheEvict(value = "house", allEntries = true)
    public void deleteCache() {
    }
}
