package practiseBasicPrograms;

public class FactorialOfNumber {

	public int factorial(int number) {

		

		int result = 1;
		System.out.println("Given Number:" + number);
		
		if (number ==0) {
			
			return 0;
		}

		while (number != 0) {

			result = result * number;
			number--;
		}
		return result;
	}

	public static void main(String[] args) {

		FactorialOfNumber FN = new FactorialOfNumber();
		int endresult = FN.factorial(7);

		System.out.println("Factorial of given number is :" + endresult);
		
	}
}