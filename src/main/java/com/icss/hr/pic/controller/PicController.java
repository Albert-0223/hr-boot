package com.icss.hr.pic.controller;

import com.icss.hr.pic.pojo.Pic;
import com.icss.hr.pic.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class PicController {
    @Autowired
    private PicService service;

    /*增加图片*/
    @RequestMapping("pic/add")
    public void add(String picInfo, MultipartFile picData, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获得登录名
        String empLoginName = (String) req.getSession().getAttribute("empLoginName");
        //SpringMVC中必须增加对应设置 才能够开启上传功能
        Pic pic = new Pic();
        pic.setPicInfo(picInfo);
        pic.setPicName(picData.getOriginalFilename());
        pic.setPicSize(picData.getSize());
        pic.setPicAuthor(empLoginName);
        pic.setPicDatetime(new Date());
        pic.setPicData(picData.getBytes());

        service.addPic(pic);
    }

    /*查询所有图片*/
    @ResponseBody
    @RequestMapping("pic/query")
    public List<Pic> query() {
        return service.queryPic();
    }

    /*得到图片*/
    @ResponseBody
    @RequestMapping("pic/get")
    public byte[] get(Integer picId) {
        return service.getPic(picId).getPicData();
    }
}
