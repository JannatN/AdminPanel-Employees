package edu.beth.adminPanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.beth.adminPanel.entity.Departments;

public interface DepartmentRepository extends JpaRepository<Departments, String> {
}
