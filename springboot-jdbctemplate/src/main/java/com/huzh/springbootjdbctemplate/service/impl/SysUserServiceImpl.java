package com.huzh.springbootjdbctemplate.service.impl;

import com.huzh.springbootjdbctemplate.dao.SysUserDao;
import com.huzh.springbootjdbctemplate.entity.SysUser;
import com.huzh.springbootjdbctemplate.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @Date 2019/9/9 12:08
 * @Author huzh
 * @Version 1.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void save(SysUser user) {
        sysUserDao.save(user);
    }

    @Override
    public void delete(String id) {
        sysUserDao.delete(id);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }
}
