package edu.beth.adminPanel.service;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

	public Departments getDepartmentById(String dept_no) {
		Optional<Departments> optional = repository.findById(dept_no);
		Departments department = null;
		if (optional.isPresent()) {
			department = optional.get();
		} else {
			throw new RuntimeException(" Department not found for dept_no :: " + dept_no);
		}
		return department;
	}

	public void deleteDepartmentById(String dept_no) {
		this.repository.deleteById(dept_no);
	}

}
