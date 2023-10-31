// JAVA code to implement three way
// partitioning of an array without
// changing the relative ordering
import java.util.*;
class GFG {
		// Function to do three way partitioning
		public static int[] pivotArray(int[] nums, int lowVal,
																	 int highVal)
		{
				// Declaring 3 queues
				Queue<Integer> before = new LinkedList<>();
				Queue<Integer> same = new LinkedList<>();
				Queue<Integer> after = new LinkedList<>();

				// Traverse the array elements one by one
				for (int i = 0; i < nums.length; i++) {

						// If the element is
						// less than pivot range
						// insert it into queue before
						if (nums[i] < lowVal)
								before.add(nums[i]);

								// Else If the element is
								// in between pivot range
								// insert it into queue same
						else if (nums[i] > highVal)
								after.add(nums[i]);

								// Else If the element is
								// less than pivot range
								// insert it into queue after
						else
								same.add(nums[i]);
				}

				int k = 0;
				// Now insert all elements
				// in queue before and
				// insert into final vector
				while (before.size() > 0) {
						nums[k++] = before.poll();
				}

				// Now insert all elements
				// in queue same and
				// insert into final vector
				while (same.size() > 0) {
						nums[k++] = same.poll();
				}

				// Now insert all elements
				// in queue after and
				// insert into final vector
				while (after.size() > 0) {
						nums[k++] = after.poll();
				}

				// Return the final vector
				return nums;
		}

		// Driver code
		public static void main(String[] args)
		{
				int arr[] = new int[] { 1, 14, 5, 20, 4, 2, 54,
								20, 87, 98, 3, 1, 32 };
				int lowVal = 20, highVal = 20;

				pivotArray(arr, lowVal, highVal);
				for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
				}
		}
}

// This code is contributed by Taranpreet
