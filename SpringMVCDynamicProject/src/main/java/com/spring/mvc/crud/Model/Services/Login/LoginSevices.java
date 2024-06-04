package com.spring.mvc.crud.Model.Services.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.crud.DTO.Login.LoginDTO;
import com.spring.mvc.crud.DTO.Registration.StudentDTO;
import com.spring.mvc.crud.Model.DAO.Login.LoginDAO;

@Service
public class LoginSevices {
	
	@Autowired
	private LoginDAO dao;
	
	public LoginSevices() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public StudentDTO loginServices(LoginDTO login) {
		StudentDTO logged = dao.loginDAO(login);
		return logged;
	}
}
