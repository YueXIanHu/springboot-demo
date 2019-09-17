package com.huzh.springbootjdbctemplate.dao;

import com.huzh.springbootjdbctemplate.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName SysUserDao
 * @Description TODO
 * @Date 2019/9/9 12:06
 * @Author huzh
 * @Version 1.0
 */
@Repository
public class SysUserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 保存用户
     *
     * @param user
     */
    public void save(SysUser user) {
        String sql = "insert into sys_user(id, name, nick_name, password, email) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getId(), user.getName(), user.getNickName(), user.getPassword(), user.getEmail());
    }

    /**
     * 删除用户
     *
     * @param id
     */
    public void delete(String id) {
        String sql = "delete from sys_user where id=?";
        jdbcTemplate.update(sql, id);
    }

    /**
     * 查询全部用户
     *
     * @return
     */
    public List<SysUser> findAll() {
        String sql = "select * from sys_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(SysUser.class));
    }
}
