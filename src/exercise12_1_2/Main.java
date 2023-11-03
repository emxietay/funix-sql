package exercise12_1_2;

import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Stack<String> stack = new Stack<>();
		String s = in.nextLine();
		String[] stringArray = s.split("");
		Arrays.stream(stringArray).forEach(e -> stack.push(e) );

		for (int i = 0; i < s.length(); i++) {
			System.out.print(stack.pop());
		}

	}
}