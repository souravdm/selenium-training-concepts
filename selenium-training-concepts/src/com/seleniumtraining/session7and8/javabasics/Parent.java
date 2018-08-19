package com.seleniumtraining.session7and8.javabasics;

public class Parent {
	
	private String name = "default";
	private int age = 0;
	private String gender = "default";
	private String occupation = "default";
	private boolean drivesCar = false;
	private boolean fliesAeroplane = false;
	
	
	public Parent(String name, int age, String gender) {
		this("IT Consultant");
		System.out.println("The person with name :"+ this.name +" of age :"+ this.age+" is of sex :"+ this.gender);
		this.name = name;this.age = age;this.gender = gender;
	}
	
	public Parent(String occupation) {
		System.out.println("Occupation : "+ this.occupation);
		this.occupation = occupation;
	}
	
	public Parent(boolean drivesCar,boolean fliesAeroplane) {
		this("Traveller");
		this.drivesCar = drivesCar;
		this.fliesAeroplane = fliesAeroplane;
	}
	
	public void printUserDetails() {
		System.out.println("The person with name :"+ name +" of age :"+ age+" is of sex :"+ gender);
	}
	
	public void printOccupation() {
		System.out.println("Occupation is :"+ this.occupation);
	}
	
	public void printTravelOptions() {
		System.out.println("Person with occupation "+this.occupation
				+" has drive car status "+this.drivesCar + " and has flying plane status "+ this.fliesAeroplane);
	}
	

}
