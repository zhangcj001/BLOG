package com.blognew.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blognew.entity.User;
import com.blognew.mapper.UserMapper;
import com.blognew.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    //根据账号密码登录
    public  User login(String account, String password){
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("account",account);
        queryWrapper.eq("password",password);
        User user=this.getOne(queryWrapper);
        return user;
    }
    //根据信息创建token
//    public String creatToken(User user){
//        Integer userId=user.getUserId();
//        String nickName=user.getNickName();
//        return JWT
//    }
}
