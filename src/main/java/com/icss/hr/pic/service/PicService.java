package com.icss.hr.pic.service;

import com.icss.hr.pic.dao.PicMapper;
import com.icss.hr.pic.pojo.Pic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PicService {
    @Resource
    private PicMapper mapper;

    /*增加图片*/
    public void addPic(Pic pic) {
        mapper.add(pic);
    }

    /*查询图片*/
    public List<Pic> queryPic() {
        return mapper.query();
    }

    /*得到图片*/
    public Pic getPic(Integer picId) {
        return mapper.getPic(picId);
    }
}
