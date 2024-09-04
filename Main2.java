import java.util.*;
public class Main {

	public static int[] pair(int[] arr, int sum) {
		int[] resultPair = new int[2];
		int maxProduct = 0;

		// Sorting the array to use two-pointer technique
		Arrays.sort(arr);

		// Initialize pointers
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int currentSum = arr[start] + arr[end];

			// Check if the current pair sums to the given value
			if (currentSum == sum) {
				// Ensure the first element is greater than the second
				if (arr[end] > arr[start]) {
					int product = arr[start] * arr[end];
					if (product > maxProduct) {
						maxProduct = product;
						resultPair[0] = arr[end];
						resultPair[1] = arr[start];
					}
				}
				end--;
				start++;
			}
			// Move pointers based on comparison with sum
			else if (currentSum > sum) {
				end--;
			} else {
				start++;
			}
		}

		return maxProduct > 0 ? resultPair : new int[] {};
	}

	public static void main(String[] args) {
		int arr[] = {11, 9, 13, 10, 8, 7, 4, 12};
		int sum = 18;
		int[] result = pair(arr, sum);

		if (result.length > 0) {
			System.out.println("Pair with maximum product: {" + result[0] + ", " + result[1] + "}");
		} else {
			System.out.println("No valid pair found");
		}
	}
}