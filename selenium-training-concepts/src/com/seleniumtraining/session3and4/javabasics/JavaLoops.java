package com.seleniumtraining.session3and4.javabasics;

public class JavaLoops {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6};

		// while loop
		int array_range = nums.length;
		int counter = 0;
		
		while(counter != array_range/2) {
			System.out.println(nums[counter]);
			counter++;
		}
		
		// do while loop
		counter = 0;

		do {
			System.out.println(nums[counter]);
			counter++;
		}while(counter != array_range/2);
		
		
		
		// for loop 
		for(int i=0;i < array_range/2;i++) {
			System.out.println(nums[i]);
		}
		
		counter = 0;
		// for each loop
		for(int num : nums) {
			if(array_range/2 == counter) break;
			
			System.out.println(num);
			counter++;
		}
		

	}

}
