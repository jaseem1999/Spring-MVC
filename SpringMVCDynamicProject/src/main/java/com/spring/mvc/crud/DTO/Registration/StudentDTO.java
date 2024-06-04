package com.spring.mvc.crud.DTO.Registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "students")
public class StudentDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int sid;
	
	@Column(name="name", length = 100)
	private String sname;
	
	private String email;
	
	@Column(name="password")
	private String pass;

	private String address;
	
	private String course;
	private String place;
	
	private int age;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() +" created");
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", address=" + address + ", course=" + course
				+ ", place=" + place + ", age=" + age + ", getSid()=" + getSid() + ", getSname()=" + getSname()
				+ ", getAddress()=" + getAddress() + ", getCourse()=" + getCourse() + ", getPlace()=" + getPlace()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
