import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Sorting {
		private static final Random random = new Random();

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


		private static int partition2(int[] a, int l, int r) {
				int x = a[l];
				int j = l;
				for (int i = l + 1; i <= r; i++) {
						if (a[i] <= x) {
								j++;
								int t = a[i];
								a[i] = a[j];
								a[j] = t;
						}
				}
				int t = a[l];
				a[l] = a[j];
				a[j] = t;
				return j;
		}

		private static void randomizedQuickSort(int[] a, int l, int r) {
				if (l < r + 1 ) {
						//use partition3
						int[] pivot = partition3(a, l, r);
						randomizedQuickSort(a, l, pivot[0] - 1);
						randomizedQuickSort(a, pivot[1] + 1, r);
				}
		}

		public static void main(String[] args) {
				FastScanner scanner = new FastScanner(System.in);
				int n = scanner.nextInt();
				int[] a = new int[n];
				for (int i = 0; i < n; i++) {
						a[i] = scanner.nextInt();
				}
				randomizedQuickSort(a, 0, n - 1);
				for (int i = 0; i < n; i++) {
						System.out.print(a[i] + " ");
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
