package com.springrestapi.springrestapi.services;
import java.util.List;

import com.springrestapi.springrestapi.entities.*;

public interface EmployeeService {

public List<Employee> getEmployee();

public Employee getEmployeeById(long Id);


public Employee addEmployee(Employee employee);
	
}
