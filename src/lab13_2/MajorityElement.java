package lab13_2;

import java.util.*;
import java.io.*;

public class MajorityElement {
	private static int countFrequency(int a[], int left, int right, int value) {
		int count = 0;
		for (int i = 0; i < right; i++) {
			if (a[i] == value) {
				count++;
			}
		}
		return count;
	}

	private static int getMajorityElement(int[] a, int left, int right) {
		//write your code here

		if (left == right) {
			return a[left];
		}

		int mid = left + (right - left) / 2;
		int leftMajority = getMajorityElement(a, left, mid);
		int rightMajority = getMajorityElement(a, mid + 1, right);

		if (leftMajority == rightMajority) {
			return leftMajority;
		}

		int leftCount = countFrequency(a, left, right, leftMajority);
		int rightCount = countFrequency(a, left, right, rightMajority);

		if (leftCount > (right - left + 1) / 2) {
			return leftMajority;
		} else if (rightCount > (right - left + 1) / 2) {
			return rightMajority;
		} else {
			return -1;
		}
	}


	public static void main(String[] args) {
	FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int majorityElement = getMajorityElement(a, 0, a.length - 1);
		if (majorityElement != -1) {
			System.out.println(1 + ": " + majorityElement);
		} else {
			System.out.println(0);
		}
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}



