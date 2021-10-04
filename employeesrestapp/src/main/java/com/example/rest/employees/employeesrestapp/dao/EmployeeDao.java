package com.example.rest.employees.employeesrestapp.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.employees.employeesrestapp.model.Employees;


@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employees,Integer>{

	
}
