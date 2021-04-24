package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

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

//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
    @GetMapping("/product/{name}")
    public Departments findProductByName(@PathVariable String name) {
        return service.getPrByName(name);
    }

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
