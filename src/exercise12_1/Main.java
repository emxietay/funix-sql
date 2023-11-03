package exercise12_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		int noElements = in.nextInt();
		for (int i = 0; i < noElements; i++) {
			list.add(in.nextInt());
		}

		boolean flag = false;
		if (list.size() <= 2) {
			flag = true;
		} else {
			flag = true;
			for (int i = 0; i < list.size() - 2; i++) {
				if ( (list.get(i + 1) - list.get(i)) * (list.get(i + 2) - list.get(i)) <= 0 ) {
					flag = false;
					break;
				}
			}
		}

		System.out.println(flag ? "YES" : "NO");

	}
}