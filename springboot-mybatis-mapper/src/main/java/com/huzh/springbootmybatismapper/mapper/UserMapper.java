package com.huzh.springbootmybatismapper.mapper;

import com.huzh.springbootmybatismapper.entity.User;
import com.huzh.springbootmybatismapper.common.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2019/9/29 15:55
 * @Author huzh
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends CommonMapper<User> {
}
