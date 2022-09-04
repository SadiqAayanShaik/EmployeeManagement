package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	void saveEmployee(Employee employee);

	void deleteEmployeeById(long id);

	Employee getEmployeeById(long id);
}
