package com.seleniumtraining.session1and2.javabasics;

public class Loops {

	public static void main(String[] args) {
	
		int num = 1, count = 1;
		boolean status = true;
		
		System.out.println(num);

		// while loop
		
		while(count <= 10){
			System.out.println(num);
			count++;
		}
		
		count = 1;
		
		System.out.println("*********************************");
		
		while(status){
			if(count == 10) status = false;
			System.out.println(num);
			count++;
		}
		
		status = true; count = 1;
		
		System.out.println("*********************************");
		// do - while loop
		
		do{
			if(count >= 10) status = false;
			System.out.println(num);
			count+=2;
		}while(status);
		
		
		// for loop
		System.out.println("*********************************");
		for(int cnt=1;cnt <= 10;cnt+=2){
			System.out.println(num);
		}
		
		// for each loop
		int[] nums = {10,20,23,45,50,60,90,100};
		
		/*for(int n : nums){
			System.out.println(n);
		}*/
		
		for(int cnt = (nums.length)-1 ; cnt >= 0; cnt --){
			System.out.println(nums[cnt]);
		}
		
		

	}

}
