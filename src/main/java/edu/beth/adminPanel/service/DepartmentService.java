package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository repository;

	public Departments saveDepartment(Departments Department) {
		return repository.save(Department);
	}

	public List<Departments> getDepartments() {
		return repository.findAll();
	}

	public List<Departments> listAll(String keyword) {
		if (keyword != null) {
			return repository.search(keyword);
		}
		return repository.findAll();
	}
  
	
	

}
