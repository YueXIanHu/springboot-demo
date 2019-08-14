package com.huzh.springbootjpa.repository;

import com.huzh.springbootjpa.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName CityRepository
 * @Description TODO
 * @Date 2019/8/2 17:42
 * @Author huzh
 * @Version 1.0
 */
public interface CityRepository extends JpaRepository<City, String> {

    void deleteByCityId(String id);

    City findByCityId(String id);
}
