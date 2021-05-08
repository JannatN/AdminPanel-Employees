package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import edu.beth.adminPanel.repository.DepartmentRepository;
import edu.beth.adminPanel.repository.EmployeeRepository;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getEmployee() {
		return repository.findAll();
	}

//	public List<Employee> listAll(String keyword) {
//		if (keyword != null) {
//			return repository.search(keyword);
//		}
//		return repository.findAll();
//	}

}