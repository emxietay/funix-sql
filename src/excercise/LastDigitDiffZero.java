package excercise;

public class LastDigitDiffZero {
	static int lastDigitDiffZero(int n) {

		if (n < 0) {
			return -1;
		}
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
			while (fact % 10 == 0) {
				fact /= 10;
			}
			fact %= 100;
		}
		return fact%10;
	}

	static void printFact(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + ": ");
			System.out.println(result*=i);
		}
	}

	public static void main(String[] args) {
		System.out.println("lastDigitDiffZero(5) = " + lastDigitDiffZero(5));

		int n = 1000000;
		System.out.println("lastDigitDiffZero(10) = " + lastDigitDiffZero(n));
//		printFact(n);
	}
}
