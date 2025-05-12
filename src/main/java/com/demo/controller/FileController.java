package com.demo.controller;

import com.demo.dto.ResponseMsg;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
public class FileController {
    @PostMapping(value = "/uploadFile")
    public ResponseMsg uploadFile(MultipartFile file, HttpServletRequest request) throws IOException {
        // 获取文件名称
        String fileName = file.getOriginalFilename();
        if (fileName == null){
            return ResponseMsg.fail("文件不存在");
        }
        // 获取文件格式
        String fileFormat = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        // 重新命名
        String newFileName = UUID.randomUUID().toString();
        fileName = newFileName+fileFormat;

        String realPath = request.getServletContext().getRealPath("/static/pic");
        System.out.println("本地地址："+realPath);
        File f = new File(realPath);
        if (!f.exists()){
            f.mkdirs();
        }
        // 将图片保存在此地址
        file.transferTo(new File(f+"/"+fileName));
        // 服务器地址
        String bookUrl = "/static/pic/"+fileName;
        // 本地真实地址
        String bookAddress = f+"\\"+fileName;
        Map<String, String> map = new HashMap<>();
        map.put("bookUrl", bookUrl);
        map.put("bookAddress", bookAddress);
        return ResponseMsg.ok(map);
    }
}
