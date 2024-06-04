package com.spring.core.DemoSpring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.dependencyInjection.Vehicle;
import com.spring.core.inti.Student;
import com.spring.core.inti.Teacher;
import com.spring.core.typeDepInj.Compute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext xml = new ClassPathXmlApplicationContext("Spring.xml");
    	Bank bank = xml.getBean(Bank.class);
    	ATM atm = (ATM) xml.getBean("atm");
    	Wid w=xml.getBean(Wid.class);
    	//
    	bank.getBankName();
    	atm.getATM();
    	w.w();
    	// constructor initialization 
    	Student stu=xml.getBean(Student.class);
    	stu.student();
    	
    	//Setter initialization 
    	Teacher teach=xml.getBean(Teacher.class);
    
    	
    	System.out.println(teach.getName());
    	
    	//Dependency injection
    	Vehicle car = (Vehicle) xml.getBean("car");
    	car.name();
    	car.ride();
    	Vehicle bike = (Vehicle) xml.getBean("bike");
    	bike.name();
    	bike.ride();
    	
    	// type Dependency injection
    	
    	Compute cm=xml.getBean(Compute.class);
    	cm.display();
  
    	
    }
}
