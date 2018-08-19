package com.seleniumtraining.session1and2.javabasics;

import java.util.Scanner;

public class CaseCondition {

	public static void main(String[] args) {
		
		// switch case
		
		int age = 15;
		
		//Scanner scan = new Scanner(System.in);
		//int age = scan.nextInt();
		System.out.println(age);
		switch(age){
			case 20 :
			case 25 :
			case 30 : System.out.println("User is allowed to buy an insurance");break;
			case 45 : System.out.println("User is allowed to buy an insurance with 15% tax");break;
			default : System.out.println("User is not allowed to buy an insurance");break;
		
		}
	}

}
