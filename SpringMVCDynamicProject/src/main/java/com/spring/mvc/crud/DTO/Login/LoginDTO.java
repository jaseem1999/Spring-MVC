package com.spring.mvc.crud.DTO.Login;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class LoginDTO implements Serializable {
	private String email;
	private String pass;
	
	public LoginDTO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" created");
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
		return "LoginDTO [email=" + email + ", pass=" + pass + "]";
	}
	
	
	
}
