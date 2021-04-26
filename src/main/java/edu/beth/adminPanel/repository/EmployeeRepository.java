package edu.beth.adminPanel.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
//	@Query("SELECT p FROM Product p WHERE CONCAT(p.name, p.brand, p.madein, p.price) LIKE %?1%")
//	@Query("SELECT p FROM Product p WHERE CONCAT(p.name, ' ', p.brand, ' ', p.madein, ' ', p.price) LIKE %?1%")
//	@Query("SELECT emp FROM employees emp WHERE emp.first_name LIKE %?1%" + " OR emp.last_name LIKE %?1%")
//	public List<Employees> search(String keyword);
}
