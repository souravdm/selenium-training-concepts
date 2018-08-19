package com.seleniumtraining.session5and6.javaadvance;

public class TestMain {
	
	public static void main(String[] args) {
		
		// Object way to class members from a different class
		
		Human hum1 = new Human();
		
		hum1.name = "Gaurav";
		hum1.age = 60;
		hum1.gender = 'M';
		
		
		hum1.Detail();
		
		Human hum2 = new Human();
		hum2.name = "Roopa";
		hum2.age = 25;
		hum2.gender = 'F';
		
		hum2.Detail();
		
		testmethod() ;
		
		testInheritance() ;
		
	
	}
	
	public static void testmethod() {
		Human hum2 = new Human();
		hum2.name = "Roopa";
		hum2.age = 25;
		hum2.gender = 'F';
		
		hum2.Detail();
	}
	
	
	public static void testInheritance() {
		Child c = new Child();
		
	//	System.out.println(c.name);
		System.out.println(c.namechild);
	}

}
