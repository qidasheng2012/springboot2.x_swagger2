package com.example.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@Api(tags = "token 控制器")
@RestController
@RequestMapping("/token")
public class TokenController {

    @GetMapping
    @ApiOperation(value = "获取token")
    @ApiImplicitParam(name = "prefix", value = "前缀")
    public String getToken(String prefix) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return prefix + uuid;
    }

}
