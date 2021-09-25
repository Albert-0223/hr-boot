package com.icss.hr.emp.controller;

import com.icss.hr.emp.pojo.Emp;
import com.icss.hr.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmpService service;

    /*增加员工*/
    @RequestMapping("emp/add")
    public void add(Emp emp, HttpServletResponse resp) {
        service.addEmp(emp);
    }

    /*删除员工*/
    @RequestMapping("emp/delete")
    public void delete(Integer empId, HttpServletResponse resp) {
        service.deleteEmp(empId);
    }

    /*修改员工*/
    @RequestMapping("emp/update")
    public void update(Emp emp, HttpServletResponse resp) {
        service.updateEmp(emp);
    }

    //分页查询
    @ResponseBody
    @RequestMapping("emp/querybypage")
    public Map<String, Object> queryByPage(@RequestParam("pageNum") Integer num, Integer pageSize) {
        return service.queryEmpByPage(num, pageSize);
    }

    /*根据empId单条查询*/
    @ResponseBody
    @RequestMapping("emp/querybyid")
    public Emp queryEmpById(Integer empId) {
        return service.queryEmpById(empId);
    }


}
