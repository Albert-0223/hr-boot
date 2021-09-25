package com.icss.hr.emp.service;

import com.icss.hr.common.Pager;
import com.icss.hr.emp.dao.EmpMapper;
import com.icss.hr.emp.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmpService {
    @Autowired
    private EmpMapper mapper;

    /*增加员工*/
    public void addEmp(Emp emp) {
        mapper.insert(emp);
    }

    /*删除员工*/
    public void deleteEmp(Integer empId) {
        mapper.delete(empId);
    }

    //修改员工
    public void updateEmp(Emp emp) {
        mapper.update(emp);
    }

    /*分页查询*/
    @Transactional(readOnly = true)
    public Map<String, Object> queryEmpByPage(Integer pageNum, Integer pageSize) {
        Pager pager = new Pager(mapper.getCount(), pageSize, pageNum);
        List<Emp> list = mapper.queryByPage(pager);

        Map<String, Object> map = new HashMap<>();
        map.put("pager", pager);
        map.put("list", list);
        return map;
    }


    @Transactional(readOnly = true)
    public Map<String, Object> queryEmpByCondition(Integer pageNum, Integer pageSize, Integer deptId, Integer jobId, String empNameKey) {

        Pager pager = new Pager(mapper.getCountByCondition(deptId, jobId, empNameKey), pageSize, pageNum);

        List<Emp> list = mapper.queryByCondition(pager, deptId, jobId, empNameKey);

        Map<String, Object> map = new HashMap<>();
        map.put("pager", pager);
        map.put("list", list);
        return map;
    }

    //查询单个员工
    @Transactional(readOnly = true)
    public Emp queryEmpById(Integer empId) {
        return mapper.queryById(empId);
    }


    //登录
    //增加员工-员工登录名称验证
    //检查用户名
    //修改密码 修改头像


}
