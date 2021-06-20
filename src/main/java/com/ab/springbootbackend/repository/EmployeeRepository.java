package com.ab.springbootbackend.repository;

import com.ab.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //no need to put this annotation
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
