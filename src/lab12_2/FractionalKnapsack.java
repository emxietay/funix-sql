package lab12_2;

import java.util.Scanner;

public class FractionalKnapsack {
	private static double getOptimalValue(int capacity, int[] values, int[] weights) {

		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] / weights[i] < values[j] / weights[j]) {
					swap(values, i, j);
					swap(weights, i, j);
				}

			}

		}

		double value = 0;

		while (capacity > 0) {
			for (int i = 0; i < values.length; i++) {
				if (capacity > weights[i]) {
					value += values[i];
					capacity -= weights[i];
				} else {
					value += (double) capacity / weights[i] * values[i];
					capacity = 0;
				}
			}
		}
		return value;


		//write your code here

	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		System.out.println(getOptimalValue(capacity, values, weights));
	}
}