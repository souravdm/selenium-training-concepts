package com.seleniumtraining.session1and2.assignments;

public class SeniorCitizen {
	
	String Gender = "";
	int Age = 0;

	public static void CheckSeniorCitizen(String Gender, int Age) {
		if (Gender == "MALE"){
			if (Age >= 60) {
				System.out.println ("Senior Citizen");	
			}
			else {
				System.out.println ("Not Senior Citizen");
			}
		}
		else if (Gender == "FEMALE"){
			if (Age >= 58) {
				System.out.println ("Senior Citizen");
			}
			else {
				System.out.println ("Not Senior Citizen");
			}	
		}
		else {
			System.out.println ("Not Senior Citizen");
		}	
	}
	
	public static void main(String[] args) {
		SeniorCitizen.CheckSeniorCitizen("MALE",61);
		SeniorCitizen.CheckSeniorCitizen("MALE",60);
		SeniorCitizen.CheckSeniorCitizen("MALE",59);
		SeniorCitizen.CheckSeniorCitizen("FEMALE",59);
		SeniorCitizen.CheckSeniorCitizen("FEMALE",58);
		SeniorCitizen.CheckSeniorCitizen("FEMALE",57);
		SeniorCitizen.CheckSeniorCitizen("",0);
	}
}

