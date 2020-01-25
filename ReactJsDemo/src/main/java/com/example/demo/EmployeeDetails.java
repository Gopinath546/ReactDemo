package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
@Id@GeneratedValue
int Id;
String firstName;
String lastName;
@Column(unique = true,nullable = false)
int rollNumber;
int phoneNumber;
public EmployeeDetails(String firstName,String lastName,int rollNumber,int phoneNumber) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.rollNumber=rollNumber;
	this.phoneNumber=phoneNumber;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
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
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "EmployeeDetails [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", rollNumber="
			+ rollNumber + ", phoneNumber=" + phoneNumber + "]";
}
public EmployeeDetails() {
	
}
}
