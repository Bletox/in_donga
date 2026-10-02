package com.example.controllers;

import java.util.List;

import com.example.models.Employee;
import com.example.repositories.EmployeeRepository;
import com.example.views.EmployeeView;

public class EmployeeController {
    EmployeeRepository employeeRepository;
    EmployeeView employeeView;

    public EmployeeController(EmployeeRepository employeeRepository, EmployeeView employeeView) {
        this.employeeRepository = employeeRepository;
        this.employeeView = employeeView;
    }

    public void list() {
        List<Employee>empList = employeeRepository.findAll();
        employeeView.showEmployee(empList);
    }

    public void delete() {
        int num = employeeRepository.delete(0);
        System.out.println("Törlések száma: " + num);
    }
}
