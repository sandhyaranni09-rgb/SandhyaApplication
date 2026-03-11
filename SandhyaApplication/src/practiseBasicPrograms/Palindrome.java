package practiseBasicPrograms;

public class Palindrome {

	
	public  void compare (int number) {
		int originalNumber = number;
		int reverseNumber =0;
		
		System.out.println("Original Number is :"+ number); //prints the given number
		
		while (number !=0) {
			int digit = number %10; // get the last digit
			reverseNumber = reverseNumber*10+digit; 
			number = number/10;
		}
		
		System.out.println("Reverse Number is :"+ reverseNumber);//prints the reversed number
		
		if (reverseNumber == originalNumber) {
			
		System.out.println("Hence " + originalNumber + " is a Palindrome");
		
		}
		
		else {
			
			System.out.println("Hence " + originalNumber + " is not Palindrome");
		}
		
		}
		
	public static void main(String[] args) {
		Palindrome check = new Palindrome();
		check.compare(123);
	}
	}
