package com.csy.springbootstart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
  @GetMapping("/")
    public Map userList(){
        Map map = new HashMap();
        map.put("userId","12312");
        map.put("userName","小明");
        return map;
    }
}
