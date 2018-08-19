package com.seleniumtraining.session1and2.javabasics;

public class Java7 {

	public static void main(String[] args) {
		// loops

		// while
		String[] strArr = {"this","is","toolsqa","class"};
		
		int index = 0;
		
		while(index <= (strArr.length)-1){
			
			System.out.println(strArr[index]);
			index++;
			
		}
 		
		// do while
		index = 0;
		
		do{
			System.out.println(strArr[index]);
			index++;
			
		}while(index <= (strArr.length)-1);
		
		
		
		index = 0;
		boolean status =  false;
		
		do {
			if (index == (strArr.length)-1) {
				status = true;
			}
			System.out.println(strArr[index]);
			index++;
		} while (!status);
		
		// for loop
		for(int i = 0;i<=(strArr.length)-1;i++){
			System.out.println(strArr[i]);
		}
		
		// for each loop
		for(String str : strArr){
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
