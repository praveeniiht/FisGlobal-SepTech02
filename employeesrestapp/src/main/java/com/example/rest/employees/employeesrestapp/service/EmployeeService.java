package com.example.rest.employees.employeesrestapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.employees.employeesrestapp.model.Employees;



public interface EmployeeService {
	
	public List<Employees> getAllEmployees();
	public Employees insertEmployee(Employees employee);
	public void deleteEmployee(int id);

}
