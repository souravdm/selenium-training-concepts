package com.seleniumtraining.session1and2.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i = 0 ;
		int j = 1 ;
		
		while (j<=20){
			System.out.println(i);
			System.out.println(j);
			i=i+j;
			j=j+i;	
		}
	}

}
