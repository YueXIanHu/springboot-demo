package com.huzh.springboottransactional.repository;

import com.huzh.springboottransactional.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName HouseRepository
 * @Description TODO
 * @Date 2019/8/5 15:49
 * @Author huzh
 * @Version 1.0
 */
public interface HouseRepository extends JpaRepository<House,Integer> {
}
