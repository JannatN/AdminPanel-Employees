package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.Employee;
import edu.beth.adminPanel.entity.User;
import edu.beth.adminPanel.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
	@Autowired

	private EmployeeService service;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
<<<<<<< HEAD
	
	@GetMapping("/showNewEmpForm")
	public String showNewEmpForm(Model model) {
		// create model attribute to bind form data
		Employees employee = new Employees();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employees employee) {
=======

	@GetMapping("/showNewEmpForm")
	public String showNewEmpForm(Model model) {
		// create model attribute to bind form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
>>>>>>> 32b7cd6fdc4059dd91820783d695f7edeab8f093
		// save employee to database
		service.saveEmployee(employee);
		return "redirect:/employees";
	}
<<<<<<< HEAD
	
	
=======

>>>>>>> 32b7cd6fdc4059dd91820783d695f7edeab8f093
	@GetMapping("/employees")
	public String employees(Model model) {
		model.addAttribute("employees", service.getEmployee());

		return "employees";
	}

	@RequestMapping("/searchEmp")
	public String searchEmployee(Model model, @Param("keyword") String keyword) {
		List<Employee> listOfEmps = service.listAll(keyword);
		model.addAttribute("employees", listOfEmps);
		model.addAttribute("keyword", keyword);

		return "employees";
	}

}