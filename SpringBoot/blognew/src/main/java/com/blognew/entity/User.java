package com.blognew.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;
    private String account;
    private  String password;
    private String nickName;
    private String profilePhoto;
}
