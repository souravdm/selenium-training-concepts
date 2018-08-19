package com.seleniumtraining.session7and8.javabasics;

public class Child extends Parent{

	public Child(String name, int age, String gender) {
		super(name, age, gender);
		super.printUserDetails();
	}
	
	public Child(boolean b, boolean c) {
		super(b,c);
		super.printTravelOptions();
	}
	
	

	

}
