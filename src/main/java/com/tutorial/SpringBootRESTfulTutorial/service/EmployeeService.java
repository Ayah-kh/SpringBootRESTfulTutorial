package com.tutorial.SpringBootRESTfulTutorial.service;

import com.tutorial.SpringBootRESTfulTutorial.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
}
