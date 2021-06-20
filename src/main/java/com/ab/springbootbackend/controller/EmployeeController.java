package com.ab.springbootbackend.controller;

import com.ab.springbootbackend.model.Employee;
import com.ab.springbootbackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees/v1")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //build create employee rest api
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //build get all employees rest api
    @GetMapping("/list")
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(), HttpStatus.OK);
    }

    //build get employee by id rest api
    @GetMapping("/list/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {

        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);

    }

    //build update employee rest api
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }

    //build delete employee rest api
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id){

        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted succesfully!",HttpStatus.OK);
    }



}
