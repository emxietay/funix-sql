package exercise7;

import java.util.Scanner;

public class Count2 {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++)
						arr[i] = sc.nextInt();
				int k = sc.nextInt();
				sc.close();
				count2(arr, k);
		}

		private static void count2(int[] a, int k) {
				quickSort2(a);
				int count = 1;
				for (int i = 1; i < a.length; i++) {
						if (a[i] - k > a[i -1]) {
								count++;
						}
				}
				System.out.println(count);
		}

		static void count(int[] a) {
				quickSort(a, 0, a.length - 1);
				int count = 1;
				for (int i = 1; i < a.length; i++) {
						if (a[i] == a[i - 1]) {
								count++;
						} else {
								System.out.printf("%d %d; ",a[i-1], count);
								count = 1;
						}
				}
				System.out.printf("%d %d; ",a[a.length-1], count);
		}

		static int search(int[] a) {
				if (a[0] != 0) return 0;
				for (int i = 0; i < a.length - 1; i++) {
						if (a[i] < a[i + 1] - 1) {
								return a[i] + 1;
						}
				}
				return a[a.length - 1]+ 1;
		}

		static void quickSort(int[] a, int l, int r) {

				int p = a[(l + r) / 2];
				int i = l, j = r;
				while (i < j) {
						while (a[i] < p) {
								i++;
						}
						while (a[j] > p) {
								j--;
						}
						if (i <= j) {
								int temp = a[i];
								a[i] = a[j];
								a[j] = temp;
								i++;
								j--;
						}
				}
				if (i < r) {
						quickSort(a, i, r);
				}
				if (l < j) {
						quickSort(a, l, j);
				}
		}

		static void quickSort2(int[] a) {
				quickSort(a, 0, a.length -1);
		}
}
