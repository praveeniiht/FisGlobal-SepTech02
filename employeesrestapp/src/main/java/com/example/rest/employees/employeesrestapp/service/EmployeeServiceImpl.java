package com.example.rest.employees.employeesrestapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.employees.employeesrestapp.dao.EmployeeDao;
import com.example.rest.employees.employeesrestapp.model.Employees;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employees insertEmployee(Employees employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		employeeDao.deleteById(id);
		
	}

}
