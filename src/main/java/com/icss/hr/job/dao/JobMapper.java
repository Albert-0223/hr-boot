package com.icss.hr.job.dao;

import com.icss.hr.job.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobMapper {
    public void insert(Job job);
    public void update(Job job);
    public void delete(Integer jodId);
    List<Job> queryJob();
    Job queryJob(@Param("jobId") Integer jobId);
}