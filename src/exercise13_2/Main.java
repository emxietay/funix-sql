package exercise13_2;

import java.util.Scanner;

public class Main {
	static int divideAndConquer(int[] a, int x) {
		return count(a, 0, a.length - 1, x);
	}

	private static int count(int[] a, int l, int r, int x) {
		if (l == r) {
			if (a[l] == x) return 1;
			else return 0;
		} else {
			int m = l+(r - l) / 2;
			return count(a, l, m, x) + count(a, m + 1, r, x);
		}
	}

	static int search(int a[], int x){
		for (int i = 0; i < a.length; i++){
			if (a[i] == x){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int array[] = new int[n];

		for(int i=0;i<n;i++) {

			array[i] = sc.nextInt();

		}

		int x=sc.nextInt();

		System.out.print(search(array, x));
	}
}
