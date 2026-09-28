package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.dtos.EmployeeListResponse;
import com.example.models.Employee;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class EmployeeRepository implements Repository<Employee, Integer>{

    private final String url = "http://localhost:8000/api/employees";

    @Override
    public List<Employee> findAll() {
        
        ResClient client = new ResClient();
        String json = client.get(url);
        EmployeeListResponse res = ResConvert.toObject(json, EmployeeListResponse.class);
        List<Employee> empList = res.data;
        return empList;
    }

    @Override
    public Employee save(Employee t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Employee update(Employee t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
