package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentsController {

	@Autowired
	private DepartmentService service;

	@PostMapping("/addDepartment")
	public Departments addDepartment(@RequestBody Departments Department) {
		return service.saveDepartment(Department);
	}

//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }

	@GetMapping("/Departments")
	public List<Departments> findAllDepartments() {
		return service.getDepartments();
	}

	@GetMapping("/searchDept/{id}")
	public List<Departments> findProductById(@PathVariable String id) {
		return service.listAll(id);
	}


}
