package com.example.swagger2.controller;

import com.example.swagger2.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
@Api(tags = "用户 Controller")
public class UserController {

    @PostMapping
    @ApiOperation(value = "创建用户")
    public User create(@RequestBody User user) {
        return user;
    }

}
