package com.rj.springboot.project.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rj.springboot.project.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
