package com.employee.EmployeeManagement;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {
@Autowired
EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	Employee a1 = new Employee(1,"SAM",10000);
	Employee a2 = new Employee(1,"RAM",12000);
	Employee a3 = new Employee(1,"KIM",13000);
	Employee a4 = new Employee(1,"JIM",47000);
	Employee a5 = new Employee(1,"GAURAV",110000);
	Employee a6 = new Employee(1,"SUMA",70000);
	Employee a7 = new Employee(1,"MASTER",80000);
	Employee a8 = new Employee(1,"JOMA",210000);
	Employee a9 = new Employee(1,"AMAN",410000);
	Employee a10 = new Employee(1,"NIDA",90000);
	employeeRepository.employee.addAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
		
	}
	
	

}
