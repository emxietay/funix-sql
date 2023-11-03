package exercise12_1_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int noElements1 = in.nextInt();
		for (int i = 0; i < noElements1; i++) {
			list1.add(in.nextInt());
		}
		int noElements2 = in.nextInt();
		for (int i = 0; i < noElements2; i++) {
			list2.add(in.nextInt());
		}

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		list3.sort(Comparator.naturalOrder());
		list3.forEach(e -> System.out.print(e + " "));


	}
}