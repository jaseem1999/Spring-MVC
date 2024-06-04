package com.spring.mvc.crud.Model.DAO.Login;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.crud.DTO.Login.LoginDTO;
import com.spring.mvc.crud.DTO.Registration.StudentDTO;

@Repository
public class LoginDAO {
	
	@Autowired
	private SessionFactory sf;
	
	public LoginDAO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public StudentDTO loginDAO(LoginDTO login) {
		
		Session session = sf.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
	
		Query query = session.createQuery("from StudentDTO dto where dto.email = :semail and dto.pass = :spass");
		query.setParameter("semail", login.getEmail());
		query.setParameter("spass", login.getPass());
		StudentDTO logged= (StudentDTO) query.uniqueResult();
		
		
		return logged;
	}
}
