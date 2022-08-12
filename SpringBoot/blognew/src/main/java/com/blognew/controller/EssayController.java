package com.blognew.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.blognew.entity.Essay;
import com.blognew.service.impl.EssayServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/essayController")
@Api(tags = "文章管理")
public class EssayController {
    @Autowired
    private EssayServiceImpl essayServiceImpl;

    @GetMapping("/searchEssay")
    @ApiOperation(value = "查找文章",notes = "根据传入的Title搜索并分页返回")
    public IPage<Essay> searchEssay(String title, Integer page, Integer num) {
        IPage<Essay> essay= essayServiceImpl.searchEssay(title,page,num);
        return essay;
//        根据 title返回essay列表
    }

    @GetMapping("/essayDetail")
    @ApiOperation(value = "文章详情",notes = "返回文章详细内容，并自动判断浏览量是否+1")
    public Essay essayDetail(Integer essayId){

//        Boolean ismy=essayServiceImpl
//        判断是谁的文章，增加浏览量
        return essayServiceImpl.essayDetail(essayId);
//        根据文章id返回文章具体内容
    }

    @PostMapping("/deleteEssay")
    @ApiOperation(value = "删除文章",notes = "根据essay_id删除文章，成功返回true")
    public Boolean deleteEssay(Integer essayId){
        Boolean flag=essayServiceImpl.deleteEssay(essayId);
        return flag;
    }

}
