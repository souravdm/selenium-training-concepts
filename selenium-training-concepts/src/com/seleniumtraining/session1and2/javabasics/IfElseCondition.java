package com.seleniumtraining.session1and2.javabasics;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {

		// if else 
		
		int age = 18;
		
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		
		
		if(age >= 20 && age <= 45) {
			System.out.println("User is allowed to buy an insurance");
		}else if(age > 45){
			System.out.println("User is allowed to buy an insurance with 15% tax");
		}else{
			System.out.println("User is not allowed to buy an insurance");
		}
	}

}
