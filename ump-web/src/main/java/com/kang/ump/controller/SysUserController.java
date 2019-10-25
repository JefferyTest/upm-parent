package com.kang.ump.controller;


import com.kang.upm.bean.SysUser;
import com.kang.upm.user.dao.SysUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangkang
 * @since 2019-09-25
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    private SysUserMapper userMapper;

    @RequestMapping("demo")
    public Object getList(){
        System.out.println(("----- selectAll method test ------"));
        List<SysUser> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList;
    }
}

