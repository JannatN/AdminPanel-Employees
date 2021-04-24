package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, String> {
}
