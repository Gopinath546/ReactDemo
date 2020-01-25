package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
@Column(unique = true,nullable = false)@Id
String emailId;
String password;
String firstName;
String lastName;

public UserDetails(String emailId,String password,String firstName,String lastName) {
	this.emailId=emailId;
	this.firstName=firstName;
	this.password=password;
	this.lastName=lastName;
}

public UserDetails() {
	
}
public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return "UserDetails [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
			+ lastName + "]";
}

}
