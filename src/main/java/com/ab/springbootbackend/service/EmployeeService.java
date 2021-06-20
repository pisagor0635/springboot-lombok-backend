package com.ab.springbootbackend.service;

import com.ab.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getEmployeeById(long id);

    Employee updateEmployee(Employee employee,long id);

    void deleteEmployee(long id);


}
