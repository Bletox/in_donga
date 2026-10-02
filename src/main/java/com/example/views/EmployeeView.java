package com.example.views;

import java.util.List;

import com.example.models.Employee;

public class EmployeeView {
    public void showEmployee(List<Employee> empList) {
        empList.forEach(emp -> {
            System.out.println(emp);
        });
    }
    public void createEmployeeList() {}
}
