package com.kang.ump.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangkang
 * @date 2019/9/24 0024
 */
@Controller
public class IndexController {

    @RequestMapping("aaa")
    public String listPage() {
        return "index";
    }

}
