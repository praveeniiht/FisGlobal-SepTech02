package com.example.rest.employees.employeesrestapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.employees.employeesrestapp.model.Employees;
import com.example.rest.employees.employeesrestapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employees>> getAllEmps(){
		List<Employees> data = empService.getAllEmployees();
		return new ResponseEntity(data,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee){
		
		return new ResponseEntity(empService.insertEmployee(employee), HttpStatus.OK);
		
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
		empService.deleteEmployee(id);
		return new ResponseEntity("Record Deleted...", HttpStatus.ACCEPTED);
	}

}
