package com.spring.core.typeDepInj;

public class Monitor {
	private String name;
	private String company;
	
	public Monitor() {
		// TODO Auto-generated constructor stub
		System.out.println("Monitor created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
