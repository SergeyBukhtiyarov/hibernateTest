package com.example.hibernate.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public long id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "SURNAME")
    public String surname;

    @Column(name = "DEPARTMENT")
    public String department;

    @Column(name = "SALARY")
    public long salary;


}
