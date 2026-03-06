package practiseBasicPrograms;

public class ReverseNumbers {

	public int reverse(int number) {

		int reverse = 0;

		System.out.println("Original number is: " + number); // print original number

		while (number != 0) {
			int digit = number % 10; // extract last digit
			reverse = reverse * 10 + digit;
			number = number / 10; // remove the last digit

		}

		return reverse;

	}

	public static void main(String[] args) {
		ReverseNumbers RN = new ReverseNumbers();
		// int number = 12345;
		int result = RN.reverse(54321);

		// System.out.println("Original number is: "+ number);
		System.out.println("Reversed number is: " + result);
	}
}