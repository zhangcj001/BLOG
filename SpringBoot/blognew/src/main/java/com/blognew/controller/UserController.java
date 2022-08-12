package com.blognew.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.blognew.entity.Essay;
import com.blognew.entity.User;
import com.blognew.service.impl.UserServiceImpl;
import com.blognew.utils.JWTUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
@Api(tags = "用户管理")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/login")
    @ApiOperation(value = "登录",notes = "输入账号密码登录,返回token")
    public String login(String account, String password) {
        User user= userServiceImpl.login(account,password);
        String token= JWTUtil.createToken(user);
        System.out.println(token);
        return token;
//        根据 title返回essay列表
    }

    @GetMapping("/currentUser")
    @ApiOperation(value = "当前用户",notes = "根据token返回当前用户")
    public Integer currentUser(String token) {
        Integer userId= JWTUtil.verifyToken(token);
        System.out.println(userId);
        return userId;
//        根据 title返回essay列表
    }

}
