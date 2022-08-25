package com.employee.EmployeeManagement;

public class Employee {
private int id;
private String Name;
private long salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public Employee(int id, String name, long salary) {
	super();
	this.id = id;
	Name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
}

}
