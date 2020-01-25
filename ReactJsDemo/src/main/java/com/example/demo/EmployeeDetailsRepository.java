package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, java.lang.Integer>{

	@Query("Select e from EmployeeDetails as e where e.rollNumber=?1")
	public EmployeeDetails findByRollNumber(int rollNumber);
}
