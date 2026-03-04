package com.emp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
    private String empname;
    private String empqulification;
    private String phonenumber;
    private String empaddhar;
    private Long id;
    private Long jobId;

    public Employee() {

    }

    public Employee(Long empid, String empname, String empqulification, String phonenumber, String empaddhar, Long id, Long jobId) {
        this.empid = empid;
        this.empname = empname;
        this.empqulification = empqulification;
        this.phonenumber = phonenumber;
        this.empaddhar = empaddhar;
        this.id = id;
        this.jobId = jobId;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpqulification() {
        return empqulification;
    }

    public void setEmpqulification(String empqulification) {
        this.empqulification = empqulification;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmpaddhar() {
        return empaddhar;
    }

    public void setEmpaddhar(String empaddhar) {
        this.empaddhar = empaddhar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empqulification='" + empqulification + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", empaddhar='" + empaddhar + '\'' +
                ", id=" + id +
                ", jobId=" + jobId +
                '}';
    }


}
