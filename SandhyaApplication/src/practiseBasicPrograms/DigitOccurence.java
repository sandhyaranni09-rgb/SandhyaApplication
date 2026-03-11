package practiseBasicPrograms;

public class DigitOccurence {

	public void numberCount(int number, int targetnumber) {

		int count = 0;

		while (number != 0) {
			int digit = number % 10;

			if (digit == targetnumber) {
				count++;

			}

			number = number / 10;
		}
		System.out.println("Digit " + targetnumber+ " appears "+ count+ " times");
	}

	public static void main(String[] args) {

		DigitOccurence DC = new DigitOccurence();
		DC.numberCount(12233421,2);

	}

}
