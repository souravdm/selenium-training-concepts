package com.seleniumtraining.session5and6.javabasics;

public class AccessTest {
	// Global space
	private static String name =  "ToolsQA";
	public static int num = 10;
	static String job = "IT";

	public static void main(String[] args) {
	
		System.out.println("Name of the company : "+ name);
	}
	
	public void TestMe() {
		System.out.println(job);
	}

}
