package com.icss.hr.emp.dao;

import com.icss.hr.common.Pager;
import com.icss.hr.emp.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    void insert(Emp emp);

    void update(Emp emp);

    void delete(Integer empId);

    Emp queryById(Integer empId);

    //获取总记录数Count
    int getCount();

    //分页查询
    List<Emp> queryByPage(Pager pager);

    //按照条件获得总记录数
    int getCountByCondition(@Param("deptId") Integer deptId,
                            @Param("jobId") Integer jobId,
                            @Param("empNameKey") String empNameKey);

    //条件分页查询
    List<Emp> queryByCondition(@Param("pager") Pager pager, @Param("deptId") Integer deptId,
                               @Param("jobId") Integer jobId, @Param("empNameKey") String empNameKey);

    //通过用戶名 查询密码
    Emp queryPwdByName(String empLoginName);

    //通过用戶名 查询头像
    Emp queryHeadByName(String empLoginName);

    //修改密码（传empLoginName 和 empPwd 注意@Param写名字)
    void updatePwd(@Param("empLoginName") String empLoginName, @Param("empPwd") String empPwd);

    //修改头像（传empLoginName 和 empPic 注意@Param写名字)
    void updatePic(@Param("empLoginName") String empLoginName, @Param("empPic") String empPic);
}