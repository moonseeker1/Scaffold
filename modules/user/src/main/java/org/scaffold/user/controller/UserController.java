package org.scaffold.user.controller;


import org.scaffold.core.api.CommonResult;
import org.scaffold.user.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public CommonResult login(@RequestBody User user){
        return CommonResult.success("login success");
    }
}
