package excercise;

import java.util.ArrayList;
import java.util.List;

import static excercise.IsPrime.isPrime;

public class FactorSum {

	public static List<Integer> listFactors(int n) {
		ArrayList<Integer> listFactors = new ArrayList<>();
		if (isPrime(n)) {
			listFactors.add(n);
		}
		int x = n;
		int m = 2;
		while (!isPrime(x)) {
			if (x % m == 0 && isPrime(m)) {
				x /= m;
				listFactors.add(m);
			} else {
				m++;
			}

			if (isPrime(x)) {
				listFactors.add(x);
			}
		}
		return listFactors;
	}

	private static int factorSum(int n) {
		if (isPrime(n)) {
			return n;
		}
		List<Integer> list = listFactors(n);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		while (!isPrime(sum)) {
			list = listFactors(sum);
			sum = list.stream().mapToInt(Integer::intValue).sum();
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println(listFactors(999999));
		System.out.println("factorSum(listFactors(24)) = " + factorSum(31));
	}

}
