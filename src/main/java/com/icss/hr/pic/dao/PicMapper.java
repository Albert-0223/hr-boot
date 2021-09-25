package com.icss.hr.pic.dao;

import com.icss.hr.pic.pojo.Pic;

import java.util.List;

public interface PicMapper {
    void add(Pic pic);

    List<Pic> query();

    Pic getPic(Integer picId);
}