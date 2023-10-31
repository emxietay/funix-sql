package exercise2;

import java.util.Scanner;

public class MergeSort {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++)
						arr[i] = sc.nextInt();
				sc.close();
				mergeSort(arr,0,arr.length - 1);
				for (int i : arr) System.out.print(i + " ");
		}

		private static void mergeSort(int[] arr, int left, int right) {
				if (left < right) {
						int middle = (left + right) / 2;
						int[] leftArray = new int[middle - left + 1];
						int[] rightArray = new int[right - middle];
						for (int i = left; i <= middle; i++)
								leftArray[i - left] = arr[i];
						for (int i = middle + 1; i <= right; i++)
								rightArray[i - middle - 1] = arr[i];
						mergeSort(leftArray, 0, leftArray.length - 1);
						mergeSort(rightArray, 0, rightArray.length - 1);
						merge(leftArray, rightArray, arr);
				}
		}

		private static void merge(int[] leftArray, int[] rightArray, int[] array) {
				int leftSize = leftArray.length;
				int rightSize = rightArray.length;
				int i = 0, left = 0, right = 0;
				while (left < leftSize && right < rightSize) {
						if (leftArray[left] < rightArray[right]) {
								array[i] = leftArray[left];
								i++;
								left++;
						} else {
								array[i] = rightArray[right];
								i++;
								right++;
						}
				}
				while (left < leftSize) {
						array[i] = leftArray[left];
						i++;
						left++;
				}
				while (right < rightSize) {
						array[i] = rightArray[right];
						i++;
						right++;
				}
		}
}
