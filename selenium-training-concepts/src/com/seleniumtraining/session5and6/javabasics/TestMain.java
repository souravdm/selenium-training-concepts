package com.seleniumtraining.session5and6.javabasics;

public class TestMain {
	
	

	public static void main(String[] args) {
		
		AccessTest.main(args); // Accessing other class member using static option
		
		System.out.println(AccessTest.num);
		
		System.out.println(AccessTest.job);
		
		Parent p = new Parent();
		
		p.name = "abx";
		

	}

}
