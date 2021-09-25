package com.icss.hr.emp.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icss.hr.dept.pojo.Dept;
import com.icss.hr.job.pojo.Job;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Emp {
    private Integer empId;

    private String empName;

    private String empLoginName;

    private String empPwd;

    private String empEmail;

    private String empPhone;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date empHiredate;

    private Integer empSal;
    //多對一映射
    private Dept dept;

    private Job job;

    private String empInfo;

    private String empPic;

    public Emp() {
    }

    public Emp(String empName, String empLoginName, String empPwd, String empEmail, String empPhone, Date empHiredate, Integer empSal, Dept dept, Job job, String empInfo, String empPic) {
        this.empName = empName;
        this.empLoginName = empLoginName;
        this.empPwd = empPwd;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empHiredate = empHiredate;
        this.empSal = empSal;
        this.dept = dept;
        this.job = job;
        this.empInfo = empInfo;
        this.empPic = empPic;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpLoginName() {
        return empLoginName;
    }

    public void setEmpLoginName(String empLoginName) {
        this.empLoginName = empLoginName == null ? null : empLoginName.trim();
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Integer empSal) {
        this.empSal = empSal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(String empInfo) {
        this.empInfo = empInfo == null ? null : empInfo.trim();
    }

    public String getEmpPic() {
        return empPic;
    }

    public void setEmpPic(String empPic) {
        this.empPic = empPic == null ? null : empPic.trim();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLoginName='" + empLoginName + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empHiredate=" + empHiredate +
                ", empSal=" + empSal +
                ", dept=" + dept +
                ", job=" + job +
                ", empInfo='" + empInfo + '\'' +
                ", empPic='" + empPic + '\'' +
                '}';
    }
}