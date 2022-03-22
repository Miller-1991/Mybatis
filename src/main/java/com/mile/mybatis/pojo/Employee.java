package com.mile.mybatis.pojo;

public class Employee {
    private Integer id;
    private String gendar;
    private String email;
    private Integer empId;

    private Empt empt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Empt getEmpt() {
        return empt;
    }

    public void setEmpt(Empt empt) {
        this.empt = empt;
    }

    public Employee(Integer id, String gendar, String email, Integer empId) {
        this.id = id;
        this.gendar = gendar;
        this.email = email;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", gendar='" + gendar + '\'' +
                ", email='" + email + '\'' +
                ", empId=" + empId +
                '}';
    }
}
