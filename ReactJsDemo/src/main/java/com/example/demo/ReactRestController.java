package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactRestController {
@Autowired
UserDetailsRepository userDetailsRepo;
@Autowired
EmployeeDetailsRepository employeeDetailsRepo;
	
	@PostMapping("/loginUser")
	public boolean validateUser(@RequestBody LoginInfo loginInfo) {
		UserDetails users = new UserDetails();
		users = userDetailsRepo.findByMailId(loginInfo.getUserName());
		System.out.println("user details");
		if (users == null) {
			System.out.println("Invalid User");
			return false;
		}
		else {
		if (loginInfo.getPassword().equals(users.getPassword())) {
			System.out.println("Valid User");
			return true;
		}
		}
		return false;
	}
	
    @PostMapping("/registerUser")
	public boolean registerUser(@RequestBody UserDetails userDetails) {
    	userDetailsRepo.save(userDetails);
    	System.out.println("User Successfully Registered");
    	return true;
	}
    
    @PostMapping("/addEmployee")
	public boolean addEmployee(@RequestBody EmployeeDetails employeeDetails) {
    	employeeDetailsRepo.save(employeeDetails);
    	System.out.println("Employee Successfully Added");
    	return true;
	}
    
    @GetMapping("/getEmployees")
	public List<EmployeeDetails> getEmployees() {
    	return employeeDetailsRepo.findAll();
	}
    
    @GetMapping("/getEmployeeById")
	public EmployeeDetails getEmployeeById(@RequestParam("rollNumber") int rollNumber) {
    	return employeeDetailsRepo.findByRollNumber(rollNumber);
	}

}
