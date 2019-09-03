package com.huzh.springbootdruid.repository;

import com.huzh.springbootdruid.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName CityRepository
 * @Description TODO
 * @Date 2019/8/30 11:12
 * @Author huzh
 * @Version 1.0
 */
public interface CityRepository extends JpaRepository<City, String> {

    void deleteByCityId(String id);

    City findByCityId(String id);
}
