package edu.beth.adminPanel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.beth.adminPanel.entity.Departments;

public interface DepartmentRepository extends JpaRepository<Departments, String> {
	@Query("SELECT d  FROM Departments d WHERE d.dept_no LIKE %?1%"
			+ " OR d.dept_name LIKE %?1%")
//	@Query("SELECT d FROM Departments d WHERE CONCAT(d.dept_no, ' ', d.dept_name) LIKE %?1%")
	
	
	
	public List<Departments> search(String keyword);


}
