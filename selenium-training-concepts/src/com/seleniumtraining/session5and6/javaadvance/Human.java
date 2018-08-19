package com.seleniumtraining.session5and6.javaadvance;

public class Human {
	
	public String name;
	public int age;
	public char gender;
	public String job;
	
	public Human() {
		
	}
	
	public Human(String name, int age, char gender, String job) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.job = job;
	}

	public void Detail() {
		System.out.println("Name : "+this.name+"\nGender : " + this.gender+ "\nAge : "+ this.age + "\nJob : "+this.job);
	}
	
	
	

}
