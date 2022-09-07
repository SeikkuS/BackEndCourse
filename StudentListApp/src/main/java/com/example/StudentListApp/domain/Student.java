package com.example.StudentListApp.domain;

public class Student {
	String firstName;
	String lastName;


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName; 
}
@Override
public String toString () {
	return "Student: " + firstName + lastName;
}
}