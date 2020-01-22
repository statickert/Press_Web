package com.example.Web.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zzh
 * @date 2020/1/21 14:24
 */
@RestController
public class testController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String hello(){
        System.out.println(port);
        return "Hello！I'm a. port：" + port;
    }
}
