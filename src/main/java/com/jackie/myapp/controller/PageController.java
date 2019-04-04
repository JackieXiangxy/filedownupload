package com.jackie.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /**
     * 初始化首页
     *
     * @return 页面路径
     */
    @RequestMapping("/")
    public String indexController() {
        return "login";
    }


    /**
     * 设置登陆页面
     *
     * @return 页面路径
     */
    @RequestMapping("/login")
    public String loignController() {
        return "login";
    }


}
