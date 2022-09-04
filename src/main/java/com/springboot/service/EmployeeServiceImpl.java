package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	@Override
	public List<Employee> getAll() {
		 
		return employeeRepo.findAll();
	}


	@Override
	public void saveEmployee(Employee employee) {
		 employeeRepo.save(employee);
		
	}


	@Override
	public void deleteEmployeeById(long id) {
		 employeeRepo.deleteById(id);
		
	}


	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
