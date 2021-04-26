package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Employees;
import edu.beth.adminPanel.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public Employees saveEmployee(Employees employee) {
		return repository.save(employee);
	}

//    public List<Employee> saveProducts(List<Employee> emp) {
//        return repository.saveAll(emp);
//    }

	public List<Employees> getEmployee() {
		return repository.findAll();
	}

//    public Product getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }
//
////    public Product updateProduct(Product product) {
////        Product existingProduct = repository.findById(product.getId()).orElse(null);
////        existingProduct.setName(product.getName());
////        existingProduct.setQuantity(product.getQuantity());
////        existingProduct.setPrice(product.getPrice());
////        return repository.save(existingProduct);
////    }

}