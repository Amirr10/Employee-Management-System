package com.example.demo.dao;

import com.example.demo.model.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = (Query<Employee>) entityManager.createQuery("from Employee", Employee.class);
        System.out.println(theQuery);

        List<Employee> employees = theQuery.getResultList();

        for (Employee emp: employees){
            System.out.println(emp);
        }

        return employees;
    }


    @Override
    @Transactional
    public List<Salary> getAllSalaries() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Salary> theQuery = currentSession.createQuery("from Salary", Salary.class);

        List<Salary> salaries = theQuery.getResultList();

        return salaries;
    }


    @Override
    @Transactional
    public List<Department> getAllDept() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Department> theQuery = currentSession.createQuery("from Department", Department.class);

        List<Department> departments = theQuery.getResultList();

        return departments;
    }


    @Override
    public List<Title> getAllTitles() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Title> theQuery = currentSession.createQuery("from Title", Title.class);

        List<Title> titles = theQuery.getResultList();

        return titles;
    }

    @Override
    public List<SalaryEmployee> getSalaryEmployee(){

        Session currentSession = entityManager.unwrap(Session.class);

        Query<SalaryEmployee> theQuery = currentSession.createQuery("from SalaryEmployee", SalaryEmployee.class);

        List<SalaryEmployee> salries = theQuery.getResultList();

        return salries;
    }


    @Override
    public List<ComissionEmployee> getComissionEmployee() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<ComissionEmployee> theQuery = currentSession.createQuery("from ComissionEmployee", ComissionEmployee.class);

        List<ComissionEmployee> comissionSalries = theQuery.getResultList();

        return comissionSalries;
    }

    @Override
    public List<HourlyEmployee> getHourlyEmployee() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<HourlyEmployee> theQuery = currentSession.createQuery("from HourlyEmployee", HourlyEmployee.class);

        List<HourlyEmployee> hourlySalries = theQuery.getResultList();

        return hourlySalries;
    }



}
