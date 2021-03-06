package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Employees;
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
	public Employees addEmployee(@RequestBody Employees employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/showNewEmpForm")
	public String showNewEmpForm(Model model) {
		// create model attribute to bind form data
		Employees employee = new Employees();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employees employee) {
		// save employee to database
		service.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees")
	public String employees(Model model) {
		model.addAttribute("employees", service.getEmployee());
		return "employees";
	}

	@GetMapping("/showFormForUpdateEmployee/{emp_no}")
	public String showFormForUpdateEmployee(@PathVariable(value = "emp_no") Integer emp_no, Model model) {
		Employees employee = service.getEmployeeById(emp_no);
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{emp_no}")
	public String deleteEmployee(@PathVariable(value = "emp_no") Integer emp_no) {

		// call delete employee method
		this.service.deleteEmployeeById(emp_no);
		return "redirect:/employees";
	}

	@RequestMapping("/searchEmp")
	public String searchEmployee(Model model, @Param("keyword") String keyword) {
		List<Employees> listOfEmps = service.listAll(keyword);
		model.addAttribute("employees", listOfEmps);
		model.addAttribute("keyword", keyword);

		return "employees";
	}
	// @RequestMapping("/searchEmp")
	// public List<Employee> searchEmployee(@Param("keyword") String keyword) {
	// return service.listAll(keyword);
	// }

}