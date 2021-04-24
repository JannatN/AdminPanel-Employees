package edu.beth.adminPanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, String> {
}
