package com.example.hibernate;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.repository.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);


    }

    public ApplicationRunner dataLoader(EmployeeRepository employeeRepository) {

        return args -> {
            Employee employee = new Employee();
            employee.setId(1);
            employee.setName("Sergey");
            employee.setSurname("Bukhtiyarov");
            employee.setDepartment("IT");
            employee.setSalary(5000);
            employeeRepository.save(employee);


        };

    }
}





