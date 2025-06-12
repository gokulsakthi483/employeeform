package com.example.EmployeeForm.service;

import com.example.EmployeeForm.model.Employee;
import com.example.EmployeeForm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }
}
