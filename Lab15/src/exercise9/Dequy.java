package exercise9;

import java.util.Scanner;


public class Dequy {
		static long giaiThua(int n) {
				if (n == 0) return 1;
				return n * giaiThua(n - 1);
		}

		static long deQuy(int a, int b) {
				if (b == 0) {
						return 1;
				}
				return a * (deQuy(a, b - 1));
		}

		static void convert(int n, int k) {

				if (0 == k) count++;
				else {
						convert(2 * n, k - 1);

						if ((n - 1) % 3 == 0 && (((n - 1) / 3 % 2) == 1))
								convert((n - 1) / 3, k - 1);
				}

		}

		static void dequy(int n, String s) {
				if (n == 0) {
						System.out.print(s + " ");
						return;
				}
				for (String x : new String[] {"0", "1"}) {
						dequy(n - 1, s + x);
				}
		}

		static int count = 0;

		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				dequy(n, "");
		}
}
