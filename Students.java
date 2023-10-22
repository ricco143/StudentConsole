package com.oop.pando;

public class Students{
	
	private String studentName;
	private String address;
	private int age;
	private int id;
	private String enrolled;
	public Students(int id, String name, String address, int age) {
		this.id = id;
		this.studentName = name;
		this.address = address;
		this.age = age;
		this.enrolled = "Not Enrolled";
	}
	
	public String getName() {
		return this.studentName;
	}	
	public String getAddress() {
		return this.address;
	}
	public int getAge() {
		return this.age;
	}
	public int getID() {
		return this.id;
	}
	public String getEnrolled() {
		return this.enrolled;
	}

}