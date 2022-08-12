package com.blognew.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class File {
    @TableId(value = "file_id",type = IdType.AUTO)
    private Integer fileId;
    private String fileUrl;
    private Integer essayId;
}
