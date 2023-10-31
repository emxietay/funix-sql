import java.util.Arrays;
import java.util.Random;

public class Test {
		public static void main(String[] args) {
				int[] a = {1, 1, 2, 3,3, 4, 5, 4, 4, 6, 6, 5, 5, 4, 3, 2};
				quickSort(a);
				Arrays.stream(a).forEach(e -> System.out.print(e + " "));

		}

		private static int[] partition3(int[] a, int l, int r) {
				//write your code here
				int start = 0, end = a.length - 1;
				int k = new Random().nextInt(l, r + 1);
				int pivot = a[k];
				System.out.println("pivot: " + pivot);
				for (int i = 0; i <= end; ) {
						if (a[i] < pivot) {
								int temp = a[i];
								a[i++] = a[start];
								a[start++] = temp;
						} else if (a[i] > pivot) {
								int temp = a[end];
								a[end--] = a[i];
								a[i] = temp;
						} else {
								i++;
						}
				}
				System.out.println(start + " " + end);
				return new int[]{start, end};
		}

		private static void quickSortHelper(int[] arr, int l, int r) {
				if (l < r) {
						int[] pivots = partition3(arr, l, r);
						quickSortHelper(arr, l, pivots[0] - 1);
						quickSortHelper(arr, pivots[1] + 1, r);
				}
		}

		private static void quickSort(int[] arr) {
				quickSortHelper(arr, 0, arr.length - 1);
		}
}
