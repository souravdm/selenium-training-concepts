package com.seleniumtraining.session1and2.javabasics;

public class Conditions {

	public static void main(String[] args) {
		
		int age = 40;
		
		if(age >= 20){ // Nested if- else
			System.out.println("Eligible for Loan");
		}else if(age >= 60){
			
		}
		
		// Switch case
		
		
		switch(age){
			case 20 : System.out.println("Eligible for Loan");break;
			case 40 : System.out.println("Eligible for Loan");break;
			case 60 : System.out.println("Eligible for 50 %Loan");break;
			default : System.out.println("Not Eligible for Loan");	
		}	

	}

}
