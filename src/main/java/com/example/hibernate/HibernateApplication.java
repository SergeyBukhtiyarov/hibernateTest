package com.example.hibernate;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.repository.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);


    }
@Bean
    public ApplicationRunner dataLoader(EmployeeRepository employeeRepository) {

        return args -> {
            Employee employee1 = new Employee();
            employee1.setName("Sergey");
            employee1.setSurname("Bukhtiyarov");
            employee1.setDepartment("IT");
            employee1.setSalary(5000);
            Employee employee2 = new Employee();
            employee2.setName("Mary");
            employee2.setSurname("Strizhneva");
            employee2.setDepartment("HR");
            employee2.setSalary(4000);
            Employee employee3 = new Employee();
            employee3.setName("Alex");
            employee3.setSurname("Bukhtiyarov");
            employee3.setDepartment("Sales");
            employee3.setSalary(4500);
            employeeRepository.save(employee1);
            employeeRepository.save(employee2);
            employeeRepository.save(employee3);


        };

    }
}





