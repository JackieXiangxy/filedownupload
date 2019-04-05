package com.jackie.myapp.controller;

import com.alibaba.fastjson.JSON;
import com.jackie.myapp.model.Fileinfo;
import com.jackie.myapp.server.FileInfoServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("file")
public class FileController {
    private final static Logger log= LoggerFactory.getLogger(FileController.class);


    @PostMapping("updaload")
    public String upload(HttpServletRequest request, HttpServletResponse response) {

        return null;
    }


    @PostMapping("download")
    public String download(HttpServletRequest request, HttpServletResponse response, String fileName, String filePath) {


        FileInputStream input = null;

        return "  dsfasdfasdfasdf";
    }


    @Autowired
    FileInfoServer infoServer;

    @ResponseBody
    @RequestMapping("/getDatas")
    public String index() {
        Integer ids=1;
        Fileinfo fileInfos=infoServer.selectById(ids);
        Map<String,Object> map=new HashMap<>();
        map.put("id",fileInfos.getId());
        map.put("name",fileInfos.getFilename());
        map.put("path",fileInfos.getFilepath());
        map.put("description",fileInfos.getDescription());
        map.put("author",fileInfos.getAnthor());
        map.put("updateTime",fileInfos.getUpdateTime());
        map.put("isDelete",fileInfos.getIsDelete());
        map.put("uploadTime",fileInfos.getUploadTime());
        map.put("createTime",fileInfos.getCreateTime());

        String res= JSON.toJSONString(map);
        return res;
    }



}
