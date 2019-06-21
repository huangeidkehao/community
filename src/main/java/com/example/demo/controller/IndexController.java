package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloController
 * Description TODO
 * Author wangchao
 * @Date 2019/6/20 14:23
 * Version 1.0
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index"; }

}
