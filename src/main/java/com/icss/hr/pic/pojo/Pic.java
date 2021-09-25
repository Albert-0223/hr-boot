package com.icss.hr.pic.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Pic {
    private Integer picId;

    private String picName;

    private String picInfo;

    private Long picSize;

    private String picAuthor;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date picDatetime;

    private byte[] picData;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(String picInfo) {
        this.picInfo = picInfo == null ? null : picInfo.trim();
    }

    public Long getPicSize() {
        return picSize;
    }

    public void setPicSize(Long picSize) {
        this.picSize = picSize;
    }

    public String getPicAuthor() {
        return picAuthor;
    }

    public void setPicAuthor(String picAuthor) {
        this.picAuthor = picAuthor == null ? null : picAuthor.trim();
    }

    public Date getPicDatetime() {
        return picDatetime;
    }

    public void setPicDatetime(Date picDatetime) {
        this.picDatetime = picDatetime;
    }

    public byte[] getPicData() {
        return picData;
    }

    public void setPicData(byte[] picData) {
        this.picData = picData;
    }
}