package com.employee.EmployeeManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
	public List<Employee> getAll() {
		
		return employeeRepository.getAll();
	}
	
	
	
	
}