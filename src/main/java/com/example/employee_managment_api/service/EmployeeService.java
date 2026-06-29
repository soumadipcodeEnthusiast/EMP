package com.example.employee_managment_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_managment_api.model.Employee;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Senthur", "DevOps", 50000));
        employees.add(new Employee(2, "John", "Testing", 45000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}