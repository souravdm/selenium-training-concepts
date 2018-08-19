package com.seleniumtraining.session5and6.javaadvance;

import com.seleniumtraining.session5and6.javabasics.Parent;

public class Child extends Parent{
	
	static String namechild = "child";
	
	public static void main(String[] args) {
		name = "Souvik";	
		printName();
		
		name = "Gaurav";
		printName();
		
		System.out.println(namechild);
		
	}
	


}
