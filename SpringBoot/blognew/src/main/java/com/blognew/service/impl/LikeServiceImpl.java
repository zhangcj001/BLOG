package com.blognew.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blognew.entity.Like;
import com.blognew.mapper.LikeMapper;
import com.blognew.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl extends ServiceImpl<LikeMapper, Like> implements LikeService {


//    public void like(Integer objectId,String type){
//        QueryWrapper<Like> queryWrapper=new QueryWrapper<>();
//        queryWrapper.ge("type",type);
//        queryWrapper.ge("objectId",objectId);
//       Like like= likeMapper.selectOne(queryWrapper);
//
//       if (like!=null){
//           if(like.getDeleted()==false){
//               queryWrapper.ge("deleted",true);
//           }
//           else
//               queryWrapper.ge("deleted",false);
////           likeMapper.update()
//       }
//       else{
//         likeMapper.insert()
//       }
//    }
    //点赞，没有则like表加记录，有则更新状态，缺当前用户
}
