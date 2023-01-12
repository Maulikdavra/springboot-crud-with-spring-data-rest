package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.luv2code.springboot.cruddemo.entity.Employee;

/*
 * By default the URL for this project will be: http://localhost:8080/magic-api/employee
 * 
 * we can define custom end points for fetching data from DB
 * To test it out, please un-comment line 14.
 * 
 */
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

}











