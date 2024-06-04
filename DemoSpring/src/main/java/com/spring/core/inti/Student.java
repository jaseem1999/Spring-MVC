package com.spring.core.inti;

public class Student {
	private int id;
	private String name;
	private String class_name;
	private String department;
	
	public Student(int id, String name, String class_name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.class_name = class_name;
		this.department = department;
	}
	
	public void student() {
		System.out.println("Student id: "+id);
		System.out.println("Name : "+name);
		System.out.println("class : "+class_name);
		System.out.println("department : "+department);
	}
	
}
