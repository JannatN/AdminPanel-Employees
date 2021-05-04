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

	@GetMapping("/showNewDeptForm")
	public String showNewDeptForm(Model model) {
		// create model attribute to bind form data
		Departments department = new Departments();
		model.addAttribute("department", department);
		return "new_department";
	}
	@PostMapping("/saveDepartment")
	public String saveDepartment(@ModelAttribute("department") Departments department) {
		// save employee to database
		service.saveDepartment(department);
		return "redirect:/departments";
	}

	@GetMapping("/departments")
	public String departments(Model model) {
		model.addAttribute("departments", service.getDepartments());

		return "departments";
	}
	
	
	@RequestMapping("/DepartmentSearch")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Departments> listDepartments = service.listAll(keyword);
        model.addAttribute("listProducts", listDepartments);
        model.addAttribute("keyword", keyword);
         
        return "departments";
    }
//	@GetMapping("/searchDept/{id}")
//	public List<Departments> findDeptById(@PathVariable String id) {
//		return service.listAll(id);
//	}

}
