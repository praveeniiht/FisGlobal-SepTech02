package com.example.springboot.springbootdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.springbootdemo.model.Employee;

@RestController
@RequestMapping("/class2")
public class SampleController2 {

	@GetMapping("/test1")
	public String test1() {
		return "From class2 - test1 method";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "From class2 - test2 method";
	}
	
	
	@PostMapping("/test3/{name}/{city}")
	public String test3(@PathVariable("name") String name, @PathVariable
			("city") String city) {
		return "Hello "+name+" welcome you are from " +city;
	}
	
	@PostMapping("/post")
	public String test5(@RequestBody Employee emp) {
		return emp.getName()+" "+emp.getDept()+" "+emp.getDesg()+" is your data";
	}
	
	@DeleteMapping("/delete")
	public String test4() {
		return "from delete mapping";
	}
	
	@PutMapping("/put")
	public String test5() {
		return "from put mapping";
	}
	
	
}
