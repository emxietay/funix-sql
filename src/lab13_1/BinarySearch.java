package lab13_1;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		var in = new Scanner(System.in);
		int n = in.nextInt();
//		List<Integer> list1 = new ArrayList<>(); ====>>> (use ArrayList)
		int[] list1 = new int[n];
		for (int i = 0; i < n; i++) {
			list1[i] = in.nextInt();
		}

		System.out.println("Second Array: ");

		int m = in.nextInt();
//		ArrayList<Integer> list2 = new ArrayList<>();
		int[] list2 = new int[m];
		for (int i = 0; i < m; i++) {
			list2[i] = in.nextInt();
		}

		for (int i = 0; i < list1.length; i++) {
			System.out.print(binarySearch(list1, list2[i]) + " ");
		}






	}




	private static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length -1;

		while(low <= high) {
			int mid = low + high >>> 1;
			int midVal = a[mid];
			if (midVal < key) {
				low = mid + 1;
			} else {
				if (midVal <= key) {
					return mid;
				}

				high = mid - 1;
			}
		}

		return -( 1);
	}



}
