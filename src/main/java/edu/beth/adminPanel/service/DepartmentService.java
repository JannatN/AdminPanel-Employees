package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository repository;

	public Departments saveDepartment(Departments Department) {
		return repository.save(Department);
	}

//    public List<Employee> saveProducts(List<Employee> emp) {
//        return repository.saveAll(emp);
//    }

	public List<Departments> getDepartments() {
		return repository.findAll();
	}

//    public Product getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//    }

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
