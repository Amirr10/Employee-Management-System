package com.example.demo.controller;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployee(){
        return employeeDAO.getAllEmployees();
    }

    @GetMapping("/getSalaries")
    public List<Salary> getSalary(){
        return employeeDAO.getAllSalaries();
    }

    @GetMapping("/getDepts")
    public List<Department> getAllDept(){
        return employeeDAO.getAllDept();
    }

    @GetMapping("/getTitles")
    public List<Title> getAllTitles(){
        return employeeDAO.getAllTitles();
    }


    @GetMapping("/getSaleryEmp")
    public List<SalaryEmployee> getSaleryEmployee(){
        return employeeDAO.getSalaryEmployee();
    }

    @GetMapping("/getComissionEmp")
    public List<ComissionEmployee> getComissionEmployee(){
        return employeeDAO.getComissionEmployee();
    }

    @GetMapping("/getHourlyEmp")
    public List<HourlyEmployee> getHourlyEmployee(){
        return employeeDAO.getHourlyEmployee();
    }

    @GetMapping("/getAllSaleries")
    public List getCombinedSalaries(){

        //get all calculated salaries from DB
        List<SalaryEmployee> salEmp = employeeDAO.getSalaryEmployee();
        List<ComissionEmployee> comEmp = employeeDAO.getComissionEmployee();
        List<HourlyEmployee> hourEmp = employeeDAO.getHourlyEmployee();

        List newList = new ArrayList();

        newList.add(salEmp);
        newList.add(comEmp);
        newList.add(hourEmp);

        return newList;
    }


}
