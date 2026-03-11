package practiseBasicPrograms;

public class LargestDigit {

	public void numberCheck(int number) {

		int largestNumber = 0;

		while (number != 0) {
			int digit = number % 10; 

			if (digit > largestNumber) {
				largestNumber = digit;

			}

			number = number / 10;
		}
			System.out.println("Largest Number is :" + largestNumber);
		}


	public static void main(String[] args) {

		LargestDigit LD = new LargestDigit();
		LD.numberCheck(58349);

	}

}
