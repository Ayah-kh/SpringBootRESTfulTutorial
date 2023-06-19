package com.tutorial.SpringBootRESTfulTutorial.service.impl;

import com.tutorial.SpringBootRESTfulTutorial.exception.ResourceNotFountException;
import com.tutorial.SpringBootRESTfulTutorial.model.Employee;
import com.tutorial.SpringBootRESTfulTutorial.repository.EmployeeRepository;
import com.tutorial.SpringBootRESTfulTutorial.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
//        Optional<Employee> employee= employeeRepository.findById(id);
//        if (employee.isPresent())
//            return employee.get();
//        else throw new ResourceNotFountException("employee","Id",id);

        return employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFountException("Employee","id",id));
    }
}
