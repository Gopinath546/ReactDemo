package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDetailsRepository extends JpaRepository<UserDetails, String>{

	@Query("Select u from UserDetails as u where emailId=?1")
	public UserDetails findByMailId(String userName);
	
}
