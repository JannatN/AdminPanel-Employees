package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DepartmentsController {

	@Autowired
	private DepartmentService service;

	@PostMapping("/addDepartment")
	public Departments addDepartment(@RequestBody Departments Department) {
		return service.saveDepartment(Department);
	}

//	@GetMapping("/Departments")
//	public List<Departments> findAllDepartments() {
//		return service.getDepartments();
//	}
	

	@GetMapping("/departments")
	public String departments(Model model) {
		model.addAttribute("departments", service.getDepartments());

		return "departments";
	}
	@GetMapping("/searchDept/{id}")
	public List<Departments> findDeptById(@PathVariable String id) {
		return service.listAll(id);
	}

}
