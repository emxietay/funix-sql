package excercise;

public class IsPrime {
	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		}
		if (n == 3 || n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("isPrime(79) = " + isPrime(79));
		System.out.println("isPrime(3) = " + isPrime(3));
		System.out.println("isPrime(5) = " + isPrime(5));
		System.out.println("isPrime(88) = " + isPrime(88));
	}

}
