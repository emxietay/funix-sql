package exercise14_99;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.zip.ZipFile;

public class Main {
	private static void resolveString(String s) {
		int n = s.length();

		boolean[][] F = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			F[i][i] = true;
		}

		int ans = 1;

		for (int len = 2; len < n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				boolean equal = s.charAt(i) == s.charAt(j);
				if (len == 2 && equal) {
					F[i][j] = true;
				} else {
					F[i][j] = F[i + 1][j - 1] && equal;
				}
				if (F[i][j]) {
					ans = Math.max(ans, len);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(F[i][j] ? 1 + " " : 0 + " ");
			}
			System.out.println();
		}
		System.out.println(ans);
	}


	public static void main(String[] args) {
		resolveString("abbcaaclakjfkdjfafflkfjalfjklibjijjjjjjjjjji".repeat(10));
	}








}
