package edu.beth.adminPanel.controller;

import edu.beth.adminPanel.entity.Employees;
import edu.beth.adminPanel.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employees addEmployee(@RequestBody Employees employee) {
        return service.saveEmployee(employee);
    }

//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }

    @GetMapping("/employees")
    public List<Employees> findAllEmployees() {
        return service.getEmployee();
    }
    
//    @RequestMapping("/")
//    public String viewHomePage(Model model, @Param("keyword") String keyword) {
//        List<Employees> listProducts = service.listAll(keyword);
//        model.addAttribute("listProducts", listProducts);
//        model.addAttribute("keyword", keyword);
//         
//        return "index";
//    }

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
