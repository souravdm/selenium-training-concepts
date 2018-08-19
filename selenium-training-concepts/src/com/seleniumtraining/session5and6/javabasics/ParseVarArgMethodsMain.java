package com.seleniumtraining.session5and6.javabasics;

public class ParseVarArgMethodsMain {

	public static void main(String[] args) {
		ParseVarArgMethods tm = new ParseVarArgMethods();
		tm.AddNumbers();
		tm.AddNumbersfromParams(3, 3);
		tm.AddNumbersfromParams(2, 3, 4);
		tm.AddNumbersfromParams("5","6");
		tm.AddNumbersfromParams("7",8);
		tm.AddNumbersfromParams(9,"10");
		
		int[] result = tm.AddNumberfromVarArgs(1,2,3,4,5,6,7,8,9);
		
		for(int res :  result) {
			printMe(String.valueOf(res));
		}
		
		//System.out.println("result : "+ result);
		
		
		
	}
	
	public static void testPrint() {
		printMe("Hi");
	}
	
	private static void printMe(String s) {
		System.out.println(s);
	}

}
