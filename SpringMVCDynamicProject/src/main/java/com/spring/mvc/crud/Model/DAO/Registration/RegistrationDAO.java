package com.spring.mvc.crud.Model.DAO.Registration;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.crud.DTO.Registration.StudentDTO;

@Repository
public class RegistrationDAO {
	
	@Autowired
	private SessionFactory fact;
	public RegistrationDAO() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public void UserRegistrationDAO(StudentDTO stdo) {
		System.out.println("User registration dao started");
		Session session=fact.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stdo);
		tx.commit();
		System.out.println("User registration dao end");	
	}
	
	public StudentDTO UserUpdateDAO(StudentDTO stdo) {
		StudentDTO stdupdated=null;
		Session session=fact.openSession();
		Transaction tx = session.beginTransaction();
		
		Query queryGet = session.createQuery("from StudentDTO dto where dto.sid = :sid");
    	queryGet.setParameter("sid", stdo.getSid());
    	stdupdated = (StudentDTO) queryGet.uniqueResult();
		System.out.println(stdupdated);
		stdupdated.setSname(stdo.getSname());
	    stdupdated.setEmail(stdo.getEmail());
	    stdupdated.setPass(stdo.getPass());
        stdupdated.setAddress(stdo.getAddress());
        stdupdated.setCourse(stdo.getCourse());
        stdupdated.setPlace(stdo.getPlace());
        stdupdated.setAge(stdo.getAge());
        session.update(stdupdated);
        
    	
    	tx.commit();
    	return stdupdated;
			
	}
}
