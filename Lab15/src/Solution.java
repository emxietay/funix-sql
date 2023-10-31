import java.util.LinkedList;
import java.util.Queue;

class Solution{
		//Function to partition the array around the range such
		//that array is divided into three parts.
		public static void threeWayPartition(int[] array, int a, int b)
		{
				// Declaring 3 queues
				Queue<Integer> before = new LinkedList<>();
				Queue<Integer> same = new LinkedList<>();
				Queue<Integer> after = new LinkedList<>();

				// Traverse the array elements one by one
				for (int i = 0; i < array.length; i++) {

						// If the element is
						// less than pivot range
						// insert it into queue before
						if (array[i] < a)
								before.add(array[i]);

								// Else If the element is
								// in between pivot range
								// insert it into queue same
						else if (array[i] > b)
								after.add(array[i]);

								// Else If the element is
								// less than pivot range
								// insert it into queue after
						else
								same.add(array[i]);
				}

				int k = 0;
				// Now insert all elements
				// in queue before and
				// insert into final vector
				while (before.size() > 0) {
						array[k++] = before.poll();
				}

				// Now insert all elements
				// in queue same and
				// insert into final vector
				while (same.size() > 0) {
						array[k++] = same.poll();
				}

				// Now insert all elements
				// in queue after and
				// insert into final vector
				while (after.size() > 0) {
						array[k++] = after.poll();
				}

				// Return the final vector
		}

		public static void main(String[] args) {
				int[] arr = new int[] { 1,  14, 5,  20, 4, 2, 54,
								20, 87, 98, 3,  1, 32 };
				int lowVal = 20, highVal = 20;

				threeWayPartition(arr, lowVal, highVal);
				for (int j : arr) {
						System.out.print(j + " ");
				}
		}
}