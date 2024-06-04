package com.spring.core.dependencyInjection;

public class Car implements Vehicle {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
		
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("BMW start");
		
	}

}
