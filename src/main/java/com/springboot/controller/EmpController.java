package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("list",employeeService.getAll());
		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		 
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "new_employee";
	}
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		 
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
	
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		 
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
}