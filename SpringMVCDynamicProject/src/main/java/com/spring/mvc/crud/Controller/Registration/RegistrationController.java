package com.spring.mvc.crud.Controller.Registration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.crud.DTO.Registration.StudentDTO;
import com.spring.mvc.crud.Model.Services.Registration.RegistrationServices;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationServices ser;
	
	
	
	public RegistrationController() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	@RequestMapping(value = "/registor.do", method = RequestMethod.POST)
	public ModelAndView userRegistrationControl(StudentDTO sdto) {
		System.out.println("User registration controller started");
		ser.userRegistrationService(sdto);
		System.out.println("User registration controller end");
		
		return new ModelAndView("/login.jsp");
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public ModelAndView userUpdateControl(StudentDTO sdto, HttpServletRequest req,HttpSession session) {
		System.out.println(sdto);
		StudentDTO stdUpdated =ser.userUpadteService(sdto);
		if(stdUpdated != null) {
			session.setAttribute("user", stdUpdated);
			return new ModelAndView("/update.jsp","update","updated successfully");
		}else {
			return new ModelAndView("/update.jsp","update","updated Failed");
		}
	}
	
}
