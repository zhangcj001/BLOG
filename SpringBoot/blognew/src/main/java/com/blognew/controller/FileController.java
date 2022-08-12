package com.blognew.controller;

import com.blognew.service.impl.FileServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/fileController")
@Api(tags = "文件管理")
public class FileController {
    @Autowired
    private FileServiceImpl fileServiceImpl;

    @PostMapping("/uploadFile")
    @ApiOperation(value = "上传附件",notes = "文章上传附件")
    public Boolean uploadFile(@RequestPart("file") MultipartFile files) throws  IllegalStateException, IOException {
        return fileServiceImpl.UploadFile(files);
    }
}
