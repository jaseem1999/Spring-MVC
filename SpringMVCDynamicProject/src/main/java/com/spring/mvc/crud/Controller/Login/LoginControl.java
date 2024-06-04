package com.spring.mvc.crud.Controller.Login;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.crud.DTO.Login.LoginDTO;
import com.spring.mvc.crud.DTO.Registration.StudentDTO;
import com.spring.mvc.crud.Model.Services.Login.LoginSevices;

@Controller
public class LoginControl {
	
	@Autowired
	private LoginSevices ser;
	HttpSession session;
	public LoginControl() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(LoginDTO login,HttpServletRequest req) {
		StudentDTO logged = ser.loginServices(login);
		
		if(logged != null) {
			session = req.getSession();
			session.setAttribute("user", logged);
			
			return new ModelAndView("/home.jsp");
		}else {
			return new ModelAndView("/login.jsp","error","login failed");
		}
		
	}
	
}
