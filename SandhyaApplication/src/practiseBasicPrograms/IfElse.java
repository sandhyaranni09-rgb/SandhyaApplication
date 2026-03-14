package practiseBasicPrograms;

import basicLearn.ExampleConstructor;


//For Loan Eligibility check
//If Age>= 21 and salary >=50000
public class IfElse extends ExampleConstructor {
	
	public void loanEligibility (int age, double salary) {
		
		if (age >=21 && salary >=50000) {
			
			System.out.println("Eligible for Loan");
			
		}
		else {
			
			System.out.println("Not eligible for Loan");
		}
		
	}
		public static void main(String[] args) {
			
			IfElse Eli = new IfElse();
			Eli.loanEligibility(23,1000);
			
			ExampleConstructor EC= new ExampleConstructor();
			//EC.Test1(2, 3);
		}
		
	}


