package excercise;

import java.util.List;

import static excercise.FactorSum.listFactors;

public class GreatestCommonPrimeDivisor {

	private static int greatestCommonPrimeDivisor(int a, int b) {
		List<Integer> factorsOfM = listFactors(a);
		System.out.println("factorsOfM = " + factorsOfM);
		List<Integer> factorsOfN = listFactors(b);
		System.out.println("factorsOfN = " + factorsOfN);
		for (int i = factorsOfM.size() - 1; i >= 0; i--) {
			Integer tuple = factorsOfM.get(i);
			if (factorsOfN.contains(tuple)) {
				return tuple;
			}
		}
		return -1;
	}



	public static void main(String[] args) {
		System.out.println();
		System.out.println(greatestCommonPrimeDivisor(34, 17));

	}

}
