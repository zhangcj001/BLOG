package com.blognew.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blognew.entity.Essay;
import com.blognew.mapper.EssayMapper;
import com.blognew.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EssayServiceImpl extends ServiceImpl<EssayMapper,Essay> implements EssayService {

    //    根据标题模糊查询文章
    public IPage<Essay> searchEssay(String title, Integer page, Integer num){
        QueryWrapper<Essay> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("essay_title",title);
//        like %title%
        Page map=new Page(page,num) ;
        System.out.println(map);
        IPage<Essay> essays=this.page(map,queryWrapper);
        return essays;
    }


    //    根据传入的文章ID返回文章具体内容
    public Essay essayDetail(Integer essayId){
        Essay essay=this.getById(essayId);
        return essay;
    }

//    根据当前用户判断是不是自己的文章，不是自己的就返回false
    public Boolean isMyEssay(){

        return false;
    }

    //增加essay表中的browse_num
    public void addBrowse(){

    };

//    根据essay_id删除文章
    public  Boolean deleteEssay(Integer essayId){
        QueryWrapper<Essay> queryWrapper=new QueryWrapper<>();
        Essay essay=this.getById(essayId);
        essay.setDeleted(true);
        queryWrapper.eq("essay_id",essayId);
        return this.update(essay,queryWrapper);
    }

//    修改文章
    public Boolean modifyEssay(){
        return true;
    }
    //新加文章
    public Boolean addEssay(){
        return true;
    }

}
