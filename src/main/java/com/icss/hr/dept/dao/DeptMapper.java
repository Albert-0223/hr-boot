package com.icss.hr.dept.dao;

import com.icss.hr.dept.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DeptMapper {
    void insert(Dept dept);

    void update(Dept dept);

    void delete(Integer deptId);

    Dept queryById(Integer deptId);

    List<Dept> query();

    List<Dept> queryDept();
    Dept queryDept(@Param("deptId") Integer deptId);
}