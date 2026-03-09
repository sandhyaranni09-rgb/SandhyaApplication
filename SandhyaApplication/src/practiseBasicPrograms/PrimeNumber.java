package practiseBasicPrograms;

public class PrimeNumber {

    public void checkPrime(int number) {

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }

    public static void main(String[] args) {

        PrimeNumber obj = new PrimeNumber();

        obj.checkPrime(2);
    }
}