package com.example.hibernate.repository;

import com.example.hibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    Employee findById(long id);
    Employee findByDepartment(String department);

}
