package lab11_1;

import java.util.Scanner;

public class Fibonacci {
	//O(N^2)
	private static long calc_fib(int n) {
		if (n <= 1)
			return n;

		return calc_fib(n - 1) + calc_fib(n - 2);
	}

	//O(N)
	public static int fibonacciRecursiveMem(int i, int[] mem) {
		if (i == 0 || i == 1) return i;

		if (mem[i] == 0) {
			mem[i] = fibonacciRecursiveMem(i - 1, mem) + fibonacciRecursiveMem(i - 2, mem);
		}

		return mem[i];
	}


	//O(N)
	public static int fibonacciIterative(int n) {
		int a = 0, b = 1, c;
		if (n == 0) return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] mem = new int[n + 1];
		System.out.println(fibonacciRecursiveMem(n, mem));
		System.out.println(fibonacciIterative(n));
	}
}