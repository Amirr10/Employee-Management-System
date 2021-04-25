package com.example.demo.dao;

import com.example.demo.model.*;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public List<Salary> getAllSalaries();
    public List<Department> getAllDept();
    public List<Title> getAllTitles();

    public List<SalaryEmployee> getSalaryEmployee();
    public List<ComissionEmployee> getComissionEmployee();
    public List<HourlyEmployee> getHourlyEmployee();


}
