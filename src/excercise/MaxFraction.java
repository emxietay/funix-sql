package excercise;

import java.util.Arrays;

public class MaxFraction {
	int maxFraction(int[] numerators, int[] denominators) {
		double max = 0.0;
		int result = 0;
		for (int i = 0; i < numerators.length; i++) {
			double fraction = (double) numerators[i] / denominators[i];
			if (fraction > max) {
				max = fraction;
				result = i;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		MaxFraction maxFraction = new MaxFraction();
		int i = maxFraction.maxFraction(new int[]{1, 2, 3}, new int[]{2, 3, 4});
		System.out.println("i = " + i);
	}
}
