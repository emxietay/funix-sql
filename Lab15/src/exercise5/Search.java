package exercise5;

import java.util.Scanner;

public class Search {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++)
						arr[i] = sc.nextInt();
				sc.close();
				quickSort(arr, 0, arr.length - 1);
				System.out.println(search(arr));
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
}
