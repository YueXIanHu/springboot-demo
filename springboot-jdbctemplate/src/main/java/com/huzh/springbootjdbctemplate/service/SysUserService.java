package com.huzh.springbootjdbctemplate.service;

import com.huzh.springbootjdbctemplate.entity.SysUser;

import java.util.List;

/**
 * @ClassName SysUserService
 * @Description TODO
 * @Date 2019/9/9 12:08
 * @Author huzh
 * @Version 1.0
 */
public interface SysUserService {
    /**
     * 保存用户
     *
     * @param user
     */
    public void save(SysUser user);

    /**
     * 删除用户
     *
     * @param id
     */
    public void delete(String id);

    /**
     * 查询全部用户
     *
     * @return
     */
    public List<SysUser> findAll();
}
