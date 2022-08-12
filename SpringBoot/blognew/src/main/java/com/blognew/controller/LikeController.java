package com.blognew.controller;


import com.blognew.service.impl.LikeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/likeController")
public class LikeController {
    @Autowired
    private LikeServiceImpl likeServiceImpl;


}
