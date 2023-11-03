package lab12_1;

import java.util.Scanner;

public class Change {
	private static int getChange(int m) {
		//write your code here

		int count = 0;

		while (m >= 10) {
			count++;
			m -= 10;
		}

		while (m >= 5) {
			count++;
			m -= 5;
		}

		while (m >= 1) {
			count++;
			m -= 1;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
