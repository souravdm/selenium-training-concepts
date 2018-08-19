package com.seleniumtraining.session1and2.assignments;

public class ReverseString {

	public static void main(String[] args) {
		
		String Word = "ToolsQA";
		String ReverseWord="";
		//System.out.println(Word.length());
		
		for (int i=Word.length()-1;i>=0;i--) {
			ReverseWord = ReverseWord+(Word.charAt(i));	
		}
		System.out.println(ReverseWord);
	}

}
