package com.blognew.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
public class Essay {
    @TableId(value = "essay_id",type = IdType.AUTO)
    private Integer essayId;
//    文章ID
    @TableField(value = "user_id")
    private Integer userId;
    //    用户ID
    @TableField(value = "deleted")
    private Boolean deleted;
    //    软删除
    @TableField(value = "label")
    private String label;
    //    标签
    @TableField(value = "essay_title",condition = SqlCondition.LIKE)
    //标题可以模糊查询
    private String essayTitle;
    //    文章标题
    @TableField(value = "essay_content")
    private String essayContent;
    //    文章内容
    @TableField(value = "browse_num")
    private Integer browseNum;
    //    文章浏览量
    @TableField(value = "like_num")
    private Integer likeNum;
    //    文章点赞数
    @TableField(value = "comment_num")
    private Integer commentNum;
    //    文章评论数
    @TableField(value = "modify_time")
    private LocalDateTime modifyTime;
    //    文章修改时间
    @TableField(value = "photos")
    private  String photos;
    //    文章图片
}
