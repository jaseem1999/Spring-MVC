package com.spring.mvc.crud.Model.Services.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.crud.DTO.Registration.StudentDTO;
import com.spring.mvc.crud.Model.DAO.Registration.RegistrationDAO;

@Service
public class RegistrationServices {
	
	@Autowired
	private RegistrationDAO rdao;
	
	public RegistrationServices() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public void userRegistrationService(StudentDTO stdo) {
		System.out.println("User registration service started");
		rdao.UserRegistrationDAO(stdo);
		System.out.println("User registration service end");
	}
	
	public StudentDTO userUpadteService(StudentDTO stdo) {
		
		StudentDTO i =rdao.UserUpdateDAO(stdo);
		return i;
		
	}
}
