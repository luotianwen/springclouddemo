package com.example.test;

import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping( "/hello")
    @ResponseBody
    public String index() {
        String a=("/hkzh/hkTest/index.html") ;

        return a;
    }
}
