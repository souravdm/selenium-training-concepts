package com.seleniumtraining.session5and6.javabasics;

import com.seleniumtraining.session5and6.javaadvance.Human;

public class TestConstuctorMain {

	public static void main(String[] args) {
		
		Human hum = new Human();
		hum.name = "Sourav";
		hum.age = 40;
		hum.gender = 'M';
		hum.job = "PAT";
		
		TestConstructor tc1 = new TestConstructor();
		tc1.printDetails();
		
		TestConstructor tc2 = new TestConstructor("Wipro",1000);
		tc2.printDetails();
		
		TestConstructor tc3 = new TestConstructor("HCL",2000,hum);
		tc3.printDetails();
		
		hum = new Human("Smita",35,'F',"MT");
		TestConstructor tc4 = new TestConstructor("TCS",3000,hum);
		tc4.printDetails();
		
		tc3.printDetails();
		
	}

}
