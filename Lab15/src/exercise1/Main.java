package exercise1;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++)
						arr[i] = sc.nextInt();
				sc.close();
				for (int i = 0; i < arr.length - 1; i++) {
						for (int j = 0; j < arr.length - i - 1; j++) {
								if (arr[j] > arr[j + 1]) {
										int temp = arr[j];
										arr[j] = arr[j + 1];
										arr[j + 1] = temp;
								}
						}
				}
				for (int i : arr) System.out.print(i + " ");
		}
}