package com.tutorial.SpringBootRESTfulTutorial.repository;

import com.tutorial.SpringBootRESTfulTutorial.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
