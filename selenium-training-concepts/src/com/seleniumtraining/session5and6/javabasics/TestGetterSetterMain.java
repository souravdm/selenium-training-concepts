package com.seleniumtraining.session5and6.javabasics;

public class TestGetterSetterMain {

	public static void main(String[] args) {
		TestGetterSetter tgs = new TestGetterSetter();
		
		System.out.println(tgs.name);
		
		System.out.println(tgs.getTrainer());
		
		tgs.setTrainer("Viren");
		
		System.out.println("New trainer is  : "+tgs.getTrainer());
		

	}

}
