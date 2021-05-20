package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.beth.adminPanel.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employees saveEmployee(Employees employee) {
		return repository.save(employee);
	}

	public List<Employees> getEmployee() {
		return repository.findAll();
	}

	public Employees getEmployeeById(Integer emp_no) {
		Optional<Employees> optional = repository.findById(emp_no);
		Employees employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for emp_no :: " + emp_no);
		}
		return employee;
	}

	public List<Employees> listAll(String keyword) {
		if (keyword != null) {
			return repository.findByFirstName(keyword);
		}
		return repository.findAll();
	}

	public void deleteEmployeeById(Integer emp_no) {
		this.repository.deleteById(emp_no);
	}


}