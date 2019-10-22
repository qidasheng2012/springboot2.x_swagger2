package com.it.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/token")
@Api(tags = "token Controller")
public class TokenController {

    @GetMapping
    @ApiOperation(value = "获取token")
    @ApiImplicitParam(name = "prefix", value = "token 前缀")
    public String getToken(String prefix) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return prefix + uuid;
    }

}
