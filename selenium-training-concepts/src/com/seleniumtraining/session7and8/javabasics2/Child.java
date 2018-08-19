package com.seleniumtraining.session7and8.javabasics2;

public class Child extends Father{
	
	public void playCricket() {
		System.out.println("Son is a right hand bats man");
	}
	
	public void fatherCricket() {
		super.playCricket();
	}

}
