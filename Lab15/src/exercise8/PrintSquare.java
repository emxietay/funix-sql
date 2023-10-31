package exercise8;

import java.util.Scanner;

public class PrintSquare {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];
				if (n > 0) {

				for (int i = 0; i < n; i++)
						arr[i] = sc.nextInt();
				sc.close();
				sortArray(arr);
				}
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

		static boolean check(int n) {
				int k = (int) Math.sqrt(n);
				return k * k == n;
		}

		static void printArray(int[] a) {
				quickSort2(a);
				int count = 0;
//				Arrays.stream(a).filter(PrintSquare::check).forEach(e -> System.out.print(e + " "));
				for (int i = 0; i < a.length - 1; i++) {
						if (check(a[i]) && a[i] != a[i+1]) {
								System.out.print(a[i] + " ");
								count++;
						}
				}
				if (check(a[a.length - 1])) {
						System.out.println(a[a.length - 1]);
				}
				if (count == 0) {
						System.out.println("NULL");
				}
		}

		static void sortArray(int[] a) {
				int[] b = a.clone();
				quickSort2(b);
				int lb = 0, rb = b.length - 1;
				int la = 0, ra = a.length - 1;

//				System.out.println(Arrays.toString(a));
//				System.out.println(Arrays.toString(b));
//				while (b[rb] > 0) rb--;

				for (int i = 0; i < b.length; i++) {
						if (b[i] > 0) {
								rb--;
						}
				}
				rb++;
				for (int i = 0; i < b.length; i++) {
						if (b[i] < 0) {
								lb++;
						}
				}
//				while (b[lb] < 0) lb++;
				lb--;
//				System.out.println(rb);

				for (int i = 0; i < a.length; i++) {
						if (a[i] == 0) {
								continue;
						}
						if (a[i] > 0) {
								a[i] = b[rb++];
						}
						if (a[i] < 0) {
								a[i] = b[lb--];
						}
				}

//				for (int ai: b) {
//						System.out.printf("%d ", ai);
//				}
				for (int ai: a) {
						System.out.printf("%d ", ai);
				}
		}
}





















