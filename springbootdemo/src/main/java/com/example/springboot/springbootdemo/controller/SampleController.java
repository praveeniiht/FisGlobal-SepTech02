package com.example.springboot.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class1")
public class SampleController {
	
	@GetMapping("/test1")
	public String test1() {
		return "Hello I am Test-1 method";
	}
	@GetMapping("/test2")
	public String test() {
		return "Hello I am Test-2 method";
	}

}
