package com.seleniumtraining.session7and8.javabasics;

public class InheritanceOverriding {

	public static void main(String[] args) {
		Parent p1 = new Parent("Souvik",35,"Male");
		p1.printUserDetails();
		p1.printOccupation();
		
		Parent p2 = new Parent("Roopa",25,"Female");
		p2.printUserDetails();
		
		p1.printUserDetails();
		
		Parent p3 = new Parent("IT Consultant");
		p3.printOccupation();
		
		Parent p4 = new Parent(true,false);
		p4.printTravelOptions();
		
		
		Child c = new Child("Souvik",35,"Male");
		Child c1 = new Child(true,false);
		
		
	}

}
