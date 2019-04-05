package com.jackie.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    private final static Logger log= LoggerFactory.getLogger(PageController.class);


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
