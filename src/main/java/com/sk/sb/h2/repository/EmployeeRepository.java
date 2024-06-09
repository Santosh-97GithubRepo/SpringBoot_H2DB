package com.sk.sb.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.sb.h2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
