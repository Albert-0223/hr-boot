package com.icss.hr.job.controller;

import com.icss.hr.job.pojo.Job;
import com.icss.hr.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 部门控制器
 */

@Controller
public class JobController {
    @Autowired
    private JobService service;

    //增加部门
    @RequestMapping("job/add")
    public void addJob(Job job, HttpServletResponse resp){
        service.addJob(job);
    }
    //修改部门
    @RequestMapping("job/update")
    public void updateJob(Job job, HttpServletResponse resp){
        service.updateJob(job);
    }
    //删除部门
    @RequestMapping("job/delete")
    public void updateJob(Integer jobId, HttpServletResponse resp){
        service.deleteJob(jobId);
    }
    //查询所有部门
    @ResponseBody
    @RequestMapping("job/query")
    public List<Job> queryJob(){
         return service.queryJob();
    }

    //根据ID查询单个员工
    @ResponseBody
    @RequestMapping("job/querybyid")
    public Job queryJobById(Integer jobId){
        return service.queryJobById(jobId);
    }

}
