package com.huzh.springbootjpamulidatasource.repository.primary;

import com.huzh.springbootjpamulidatasource.entity.primary.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName CityRepository
 * @Description TODO
 * @Date 2019/8/28 18:59
 * @Author huzh
 * @Version 1.0
 */
public interface CityRepository extends JpaRepository<City,Integer> {
}
