package exercise12_1;

import java.util.Scanner;

class DeleteFromArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		int pos = in.nextInt();

		for (int i = pos; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}