package com.example.hystrixdashboard;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote2{

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}