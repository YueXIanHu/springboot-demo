package com.huzh.springbootmybatismapper.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName CommonMapper
 * @Description TODO
 * @Date 2019/9/29 17:21
 * @Author huzh
 * @Version 1.0
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
