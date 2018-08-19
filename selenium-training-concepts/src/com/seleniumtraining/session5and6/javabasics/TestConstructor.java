package com.seleniumtraining.session5and6.javabasics;

import com.seleniumtraining.session5and6.javaadvance.Human;

public class TestConstructor {
	
	private String company;
	private int salary;
	public Human hum;
	
	public TestConstructor() {
		System.out.println("This is a default constructor");
		this.company = "";
		this.salary = 0;	
		this.hum = new Human();
	}
	
	public TestConstructor(String comp,int salary) {
		System.out.println("This is a custom constructor ->default child constructor");
		this.company = comp;
		this.salary = salary;	
		this.hum = new Human();
	}
	
	public TestConstructor(String comp,int salary, Human hum) {
		System.out.println("This is a custom constructor1");
		this.company = comp;
		this.salary = salary;
		this.hum = hum;
	}
	
	
	
	public void printDetails() {
		System.out.println("Company : "+company);
		System.out.println("Salary : "+salary);
		hum.Detail();
	}

}
