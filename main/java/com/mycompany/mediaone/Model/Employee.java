/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mediaone.Model;

/**
 *
 * @author Quang
 */
public class Employee {
    int employeeID;
    String employeename;
    String address;
    String phone;
    String birthday;
    String sex;
    String username;
    String password;
    String role;
    int status;
    public Employee(int employeeID, String employeename, String address,
            String phone, String birthday, String sex, String username,
            String password, String role, int status)
    {
        this.employeeID = employeeID;
        this.employeename = employeename;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.sex = sex;
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    } 
}
