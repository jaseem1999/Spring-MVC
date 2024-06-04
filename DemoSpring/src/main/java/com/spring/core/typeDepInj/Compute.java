package com.spring.core.typeDepInj;

public class Compute {
	private String name;
	private String price;
	
	private Monitor mn;
	
	public Compute() {
		// TODO Auto-generated constructor stub
		System.out.println("Computer created");
		
	}
	
	public void display() {
		if(mn != null) {
			System.out.println("Computer on");
		}else {
			System.out.println("Computer shedown created monitor ref not define");
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Monitor getMn() {
		return mn;
	}

	public void setMn(Monitor mn) {
		this.mn = mn;
	}
	
	
}
