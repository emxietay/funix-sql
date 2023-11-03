package lab12_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentSummands {
	private static List<Integer> optimalSummands(int n) {
		List<Integer> summands = new ArrayList<>();
		//write your code here
		int s = 1;
		int m = n;
		while (m > 0) {
			if (m == s) {
				summands.add(m);
				m = 0;
			}
			if (m >= 2 * s + 1) {
				m -= s;
				summands.add(s);
			}
			s++;
		}
		return summands;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> summands = optimalSummands(n);
		System.out.println(summands.size());
		for (Integer summand : summands) {
			System.out.print(summand + " ");
		}
	}
}