package com.huzh.springbootjdbctemplate.controller;

import com.huzh.springbootjdbctemplate.entity.SysUser;
import com.huzh.springbootjdbctemplate.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SysUserController
 * @Description TODO
 * @Date 2019/9/9 12:09
 * @Author huzh
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value = "/save")
    public Object save(@RequestBody SysUser user) {
        sysUserService.save(user);
        return 1;
    }

    @GetMapping(value = "/delete")
    public Object delete(@RequestParam("id") String id) {
        sysUserService.delete(id);
        return 1;
    }

    @GetMapping(value = "/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}
