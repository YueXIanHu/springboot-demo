package com.huzh.springbootjpamulidatasource.repository.secondary;

import com.huzh.springbootjpamulidatasource.entity.secondary.House;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName HouseRepository
 * @Description TODO
 * @Date 2019/8/28 19:00
 * @Author huzh
 * @Version 1.0
 */
public interface HouseRepository extends JpaRepository<House, Integer> {
}
