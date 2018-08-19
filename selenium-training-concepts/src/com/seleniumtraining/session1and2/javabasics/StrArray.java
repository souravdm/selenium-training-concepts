package com.seleniumtraining.session1and2.javabasics;

public class StrArray {

	public static void main(String[] args) {
		
		// option 1
		
		int[] intArr = new int[5];
		
		// min index - 0 goes to max index of size - 1
		
		intArr[0] = 10; intArr[1] = 20;
		
		System.out.println(intArr[0]+"--"+intArr[1]);
		
		System.out.println("this is the value of intArr[0] : "+intArr[0]);
		System.out.println("this is the value of intArr[1] : "+intArr[1]);
		
		// option 2
		
		String[] strArr = {"this","is","toolsqa","class"};
		
		System.out.println(strArr[0]+" "+strArr[1]+" "+strArr[2]+" "+strArr[3]);
		
	}
	
	
}
