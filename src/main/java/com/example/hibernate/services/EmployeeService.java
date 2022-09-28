package com.example.hibernate.services;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void save(Employee employee) {
        Employee employeeFromDB = employeeRepository.findById(employee.getId());
        if (employeeFromDB == null) {
            employeeRepository.save(employee);
        }
    }

}
