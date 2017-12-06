package com.mybatis01.bean;

public class Employee {
	private int id;	
	private String lastName;
	private char gender;
	private String email;
	
	public void Employee(){}
	public void Employee(int id,String lastName,char gender,String email){
		this.email = email;
		this.id = id;
		this.gender= gender;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
