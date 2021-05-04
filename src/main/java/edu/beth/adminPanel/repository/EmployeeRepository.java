package edu.beth.adminPanel.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Departments;
import edu.beth.adminPanel.entity.Employee;
import edu.beth.adminPanel.entity.User;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	@Query("SELECT e  FROM Employee d WHERE e.first_name LIKE %?1%")
////	@Query("SELECT d FROM Departments d WHERE CONCAT(d.dept_no, ' ', d.dept_name) LIKE %?1%")
//
//	public List<Employee> search(String keyword);

}

