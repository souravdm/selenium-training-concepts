package com.seleniumtraining.session1and2.javabasics;


// if -else & switch case
public class Conditions1 {

	public static void main(String[] args) {
		
		byte age = 20;
		
		if(age > 18) {
			System.out.println("Allowed to drive");
		}else if (age < 18){
			System.out.println("Not allowed to drive");
		}
		
		switch(age) {
		
		case 18 : System.out.println("Allowed to drive");break;
			
		case 25 : System.out.println("Allowed to drive");break;
			
		case 65 : System.out.println("Not allowed to drive");break;
			
		default : System.out.println("Not a valid date");
		
		}
		
		
		
		
	}

}
