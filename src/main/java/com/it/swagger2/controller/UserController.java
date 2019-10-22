package com.it.swagger2.controller;

import com.it.swagger2.domain.User;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Slf4j
@RestController
@RequestMapping("/user")
@Api(tags = "用户 Controller")
public class UserController {

    // 创建用户
    @ApiIgnore // 忽略，不生成文档
    @PostMapping
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据ID获取用户信息", notes = "根据ID获取用户信息详细描述")
    public User getUser(@PathVariable("id") Long id) {
        return new User(1L, "张三", 23);
    }

    @ApiOperation(value = "删除用户", notes = "删除用户详细描述")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户的唯一标识", required = true),
            @ApiImplicitParam(name = "name", value = "用户名", required = false)
    })
    @ApiResponses({
            @ApiResponse(code = 401, message = "禁止访问")
    })
    @DeleteMapping("/{id}/{name}")
    public String deleteUsers(@PathVariable("id") Long id, @PathVariable("name") String name) {
        return "删除成功";
    }

}
