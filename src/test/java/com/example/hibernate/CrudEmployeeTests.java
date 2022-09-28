package com.example.hibernate;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrudEmployeeTests {
    @Autowired
    EmployeeRepository repository;

    @Test
    public void saveNewEmployeeAndThenUpdateItsDepartment() {
        //создаем нового работника
        Employee employee1 = new Employee();
        employee1.setName("Sergey");
        employee1.setSurname("Bukhtiyarov");
        employee1.setDepartment("IT");
        employee1.setSalary(5000);
        //сохраняем нового работника в базу (ему присваивается айди 1 автоматически)
        repository.save(employee1);

        //обращаемся к базе и достаем оттуда работника по департаменту (сохраненного строчкой выше)
        //Записываем этого работника в переменную empFromDbWithOldDepartment
        //печатаем его в консоль и убеждаемся, что айди=1, департамент ИТ
        Employee empFromDbWithOldDepartment = repository.findByDepartment("IT");
        System.out.println(empFromDbWithOldDepartment);

        //вызываем сеттер и меняем департамент
        //печатаем в консоль и убеждаемся, что айди=1, а департамент изменился
        empFromDbWithOldDepartment.setDepartment("New Department Test");
        System.out.println("Changed employee: ");
        System.out.println(empFromDbWithOldDepartment);

        //еще раз вызываем метод сейв, передав ему объект с айди=1 и НОВЫМ департаментом
        repository.save(empFromDbWithOldDepartment);

        //опять обращаемся к базе и ищем по измененному департаменту
        //печатаем в консоль и убеждаемся что айди=1, имя фамилия зарплата сохранились, а департамент изменился
        Employee employeeFromDbWithNewDepartment = repository.findByDepartment("New Department Test");
        System.out.println(employeeFromDbWithNewDepartment);


    }

}
