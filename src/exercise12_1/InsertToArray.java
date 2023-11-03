package exercise12_1;

import java.util.Scanner;

class InsertToArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		int[] arr = new int[arrSize+1];
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("start: ");
			arr[i] = in.nextInt();
		}

		int pos = in.nextInt();
		int x = in.nextInt();

		for (int i = arr.length - 1; i > pos; i--) {
			arr[i] = arr[i-1];
		}

		arr[pos] = x;

		for (int stuple: arr)
			System.out.print(stuple + " ");
	}
}