package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.Employees;
import edu.beth.adminPanel.entity.User;
import edu.beth.adminPanel.repository.EmployeeRepository;
import edu.beth.adminPanel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
//	@GetMapping("/employees")
//	public List<Employees> findAllEmployees() {
//		return service.getEmployee();
//	}
//	@GetMapping("/employees")
//	public String listemps(Model model) {
//		model.addAttribute("listEmps", service.getEmployee());
//
//		return "employees.html";
//	}
//	@GetMapping("/searchDept/{id}")
//	public List<Employees> findDeptById(@PathVariable String id) {
//		return service.listAll(id);
//	}

//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }
//
////    @PutMapping("/update")
////    public Product updateProduct(@RequestBody Product product) {
////        return service.updateProduct(product);
////    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return service.deleteProduct(id);
//    }
}