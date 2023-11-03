package exercise13_3;

import java.util.Scanner;

public class Main {
	private static int countInversions(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}

	private static int mergeSort(int[] arr, int left, int right) {
		int count = 0;
		if (left < right) {
			int mid = (left + right) / 2;
			count += mergeSort(arr, left, mid);
			count += mergeSort(arr, mid + 1, right);
			count += merge(arr, left, mid, right);
		}
		return count;
	}

	private static int merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		int count = 0;

		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				count += mid - i + 1; // Đếm số inversion
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= right) {
			temp[k++] = arr[j++];
		}

		System.arraycopy(temp, 0, arr, left, temp.length);

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] array = new int[n];

		for(int i=0;i<n;i++) {

			array[i] = sc.nextInt();

		}

		System.out.println(mergeSort(array, 0, array.length - 1));


	}
}
