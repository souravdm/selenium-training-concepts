package com.seleniumtraining.session1and2.javabasics;


// Arrays
public class IntArrays1 {

	public static void main(String[] args) {
		
		
		// option 1 
		int[] nums = new int[5];
		// size = 5
		// index = size - 1 = 4
		
		// initailized array boxes
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 5;
		nums[4] = 5;
		
		System.out.println(nums[0] + nums[2]);
		
		
		// option2	
		int[] nums2 = {1,2,3,4,5,6,7,8,9};		
		System.out.println("Size of the array nums2 = "+ nums2.length);
		
		

	}

}
