import java.util.Arrays;
import java.util.Random;

public class Solution2 {
		public static int[] partition3(int[] arr, int l, int r) {
				if (r - l <= 1) {
						return new int[]{0, 0};
				}
				int start = l, end = r;
				int ran = new Random().nextInt(0, end + 1);
				int pivot = arr[ran];
				System.out.println("pivot = " + pivot);
				for (int i = 0; i <= end;) {
						if (arr[i] < pivot) {
								if (i == start) {
										start++;
										i++;
								} else {
									//	swap(arr[i], arr[start++]);
										int temp = arr[i];
 										arr[i] = arr[start];
										arr[start++] = temp;

								}
						} else if (arr[i] > pivot) {
								// swap(arr[i], arr[end--]);
								int temp = arr[i];
								arr[i] = arr[end];
								arr[end--] = temp;
						} else {
								i++;
						}
				}
				int[] result = {start, end};
				System.out.println(Arrays.toString(result));
				return result;
		}


		static void quickSort(int[] arr, int l, int r) {
				if (l < r) {
						int[] pivots = partition3(arr, l, r);
						quickSort(arr, l, pivots[0] - 1);
						quickSort(arr, pivots[1] + 1, r );
				}
		}

		static void quickSort2(int[] arr) {
				quickSort(arr, 0, arr.length - 1);
		}




		public static void main(String[] args) {
				int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 20, 1};
				int[] arr2 = {1};

				int n = arr.length;
//				partition3(arr2, 0, arr.length - 1);
//				System.out.println("Modified array:");
//				for (int j : arr) {
//						System.out.print(j + " ");
//				}
				quickSort2(arr);
				System.out.println(Arrays.toString(arr));
		}

}
