package edu.beth.adminPanel.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
//	@Query("SELECT e FROM Employees e WHERE e.lastName LIKE %?1%"
	@Query("SELECT e FROM Employees e WHERE e.firstName LIKE %?1%")
	public List<Employees> findByFirstName(String keyword);

}
