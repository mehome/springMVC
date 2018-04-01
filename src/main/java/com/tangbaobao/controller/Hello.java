package com.tangbaobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 唐学俊
 * @create 2018/03/31
 **/
@Controller
public class Hello {
    @RequestMapping("/hello.action")
    public String sayHello(){
        System.out.println("试图映射器触发");
        return "hello";
    }
}
