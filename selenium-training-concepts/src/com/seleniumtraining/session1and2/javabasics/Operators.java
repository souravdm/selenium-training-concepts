package com.seleniumtraining.session1and2.javabasics;

public class Operators {

	public static void main(String[] args) {
		
		// Assignment operator
		int age = 70;
		
		// Arithmetic Operators
		
		System.out.println(age+10);
		System.out.println(age*2);
		System.out.println(age/10);
		System.out.println(age%10);
		System.out.println(age-10);
		
		// Relational Operators
		
		if(age <= 20){ // Nested if- else
			System.out.println("Eligible for Loan");
		}else if(age >= 60){
			
		}
		
		// Logical Operators
		
		if(age >= 20 && age<=60 ){ // Nested if- else
			System.out.println("Eligible for Loan");
		}else if(age > 60 && age <= 70){
			System.out.println("Eligible for 50 %Loan");
		}
	
		// AND Operator : &&
		// OR Operator : ||
		
		// Pre and Post fix
		
		int num = 5; // num++ / ++num
		
		System.out.println(++num);
		
		System.out.println(num);
		
		
		// Compound Operators
		num +=2;
		
		System.out.println(num);
		
		
		
		
		
		
	}

}