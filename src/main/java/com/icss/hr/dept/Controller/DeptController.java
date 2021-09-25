package com.icss.hr.dept.Controller;

import com.icss.hr.dept.pojo.Dept;
import com.icss.hr.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*部门控制器*/
@Controller
public class DeptController {
    @Autowired
    private DeptService service;

    /*增加部门*/
    @RequestMapping("dept/add")
    public void addDept(Dept dept, HttpServletResponse resp) {
        service.addDept(dept);
    }

    /*根据部门ID删除部门
    地址绑定117行QueryDept删除按钮*/
    @RequestMapping("dept/delete")
    public void deleteDept(Integer deptId, HttpServletResponse resp) {
        service.deleteDept(deptId);
    }

    /*查询所有部门*/
    @ResponseBody
    @RequestMapping("dept/query")
    public List<Dept> queryDept() {
        return service.queryDept();
    }

    /*根据部门ID查询部门，实现表单回显*/
    @ResponseBody
    @RequestMapping("dept/queryDeptById")
    public Dept queryDeptById(Integer deptId) {
        return service.queryDeptById(deptId);
    }

    /*修改部门*/
    @RequestMapping("dept/update")
    public void updateDept(Dept dept, HttpServletResponse resp) {
        service.updateDept(dept);
    }

}
