package com.blognew.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Like {
    @TableId(value = "essay_id",type = IdType.AUTO)
    private Integer likeId;
//    点赞ID
    private Integer userId;
    //    点赞用户ID
    private Boolean deleted;
    //    点赞软删除
    private String type;
//    点赞对象的类型
    private Integer objectId;
//    点赞对象的ID
}
