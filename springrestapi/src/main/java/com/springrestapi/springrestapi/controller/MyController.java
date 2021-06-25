package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Employee;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		
		//controller
		return "This is home controller";
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		
		
		List<Employee> e=null;
		return e;
		
		
	}
}
