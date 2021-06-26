package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Employee;
import com.springrestapi.springrestapi.services.EmployeeService;

@RestController
public class MyController {

//	@GetMapping("/test")
//	public String test() {
//		
//		//controller
//		return "This is test controller";
//	}
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		
			return this.employeeService.getEmployee();
		
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable String empId){
		
	return	this.employeeService.getEmployeeById(Long.parseLong(empId));
		
	//return "this is empbyid call";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.employeeService.addEmployee(employee);
		
	}
}
