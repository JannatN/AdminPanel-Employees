package edu.beth.adminPanel.service;
import edu.beth.adminPanel.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.beth.adminPanel.repository.EmployeeRepository;
import java.util.List;

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

	public List<Employees> listAll(String keyword) {
		if (keyword != null) {
			return repository.findByFirstName(keyword);
		}
		return repository.findAll();
	}

}