package com.jackie.myapp.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("userCheck")
public class LoginController {

    @PostMapping("login")
    public String userLogin(HttpServletRequest request,String data){
//        Map<String,Object> map= new HashMap<>();
        if (data!=null){

        }
       /* if (map.get("username")!=null){
        }*/
        return null;
    }





}
