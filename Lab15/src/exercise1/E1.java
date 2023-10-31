package exercise1;

import java.util.Arrays;

public class E1 {
		static int[] bubbleSort(int[] a) {
				for (int i = 0; i < a.length - 1; i++) {
						for (int j = 0; j < a.length - 1; j++) {
								if (a[j] > a[j+1]) swap(a, j, j+1);
						}
				}
				return a;
		}

		static void swap(int[] a, int x, int y) {
				int temp = a[x];
				a[x] = a[y];
				a[y] = temp;
		}

		public static void main(String[] args) {
				int[] ints = {1, 2, 3, 4, 5, 6, 5,4,3,2,1};
				System.out.println(Arrays.toString(bubbleSort(ints)));
		}
}
