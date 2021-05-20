package edu.beth.adminPanel.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	// @Query("SELECT d FROM Departments d WHERE CONCAT(d.dept_no, ' ', d.dept_name)
	// LIKE %?1%") concat(CC.FirstName , ' ' , CC.LastName) LIKE 'n%'
	@Query("SELECT e FROM Employees e WHERE e.lastName LIKE %?1%")
//	@Query("SELECT e FROM Employees e WHERE e.firstName LIKE %?1%"
//	+ " OR e.lastName LIKE %?1%"
//	+ " OR CONCAT(e.firstName, '',e.lastName) LIKE %?1%")
	public List<Employees> findByFirstName(String keyword);

}
