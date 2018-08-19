package com.seleniumtraining.session5and6.javabasics;


public class ParseVarArgMethods {
	
	
		public void AddNumbers() {
			printMe(2+2);
		}
		
		public void AddNumbersfromParams(int a,int b) {
			System.out.println(a+b);
		}
		
		public void AddNumbersfromParams(int a,int b,int c) {
			System.out.println(a+b+c);
		}
		
		public void AddNumbersfromParams(String a,String b) {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);			
			System.out.println(numA+numB);
		}
		
		public void AddNumbersfromParams(String a,int b) {
			int numA = Integer.parseInt(a);
			System.out.println(numA+b);
		}
		
		public void AddNumbersfromParams(int b,String a) {
			int numA = Integer.parseInt(a);
			System.out.println(numA+b);
		}
			
		public int[] AddNumberfromVarArgs(int... nums) { // 1, 2
			int temp = 0;
			int i = 0;
			int len = nums.length;
			int [] numarray = new int[nums.length+1];
			for(int num : nums) {
				numarray[i++]=num;
				temp =  num+ temp;
			}
			numarray[len]=temp;
			return numarray;
		}
		
		
		private static void printMe(int s) {
			System.out.println(s);
		}
		
		

}
