package com.blognew.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blognew.mapper.FileMapper;
import com.blognew.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, com.blognew.entity.File> implements FileService {
    @Autowired
    private FileMapper fileMapper;

    //上传附件
    public boolean UploadFile(MultipartFile files) throws IllegalStateException, IOException {
        if(files.getSize()== 0) {
            return false;
        }
        File file = null;
        String path = "C:\\Users\\zcj\\Desktop\\blognew\\src\\uploadFile\\";
//文件保存位置
//            System.err.println("文件的大小为" + files.getSize());
//            System.err.println("文件是否为空" + files.isEmpty());
//            System.err.println("文件的媒体类型为" + files.getContentType());
//            System.err.println("文件的文件名为" + files.getName());
//            System.err.println("文件的源文件名为" + files.getOriginalFilename());
        File newFile = new File(path + files.getOriginalFilename());
        if (newFile.exists()){

        }
        files.transferTo(newFile);
        //保存文件

        //更新数据库
        return true;
    }

    //下载附件
    public Boolean downloadFile(String fileName) throws FileNotFoundException {
        String path = "C:\\Users\\zcj\\Desktop\\blognew\\src\\downloadFile\\";
        File file=new File(path+fileName);
        // 文件的存放路径
        InputStream inStream = new FileInputStream(path+fileName);
        // 读到流中
        
        return true;
    }

}
