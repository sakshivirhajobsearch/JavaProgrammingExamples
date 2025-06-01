package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_09A_Subarray_With_Given_Sum_Handles_Negative_Numbers {

	/*
	 * Returns true if the there is a subarray of arr[] with sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 */
	static int subArraySum(int arr[], int n, int sum) {

		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = 0;

			// try all subarrays starting with 'i'
			for (j = i; j < n; j++) {
				curr_sum = curr_sum + arr[j];

				if (curr_sum == sum) {
					System.out.print("Sum found between indexes " + i + " and " + j);
					return 1;
				}
			}
		}

		System.out.print("No subarray found");
		return 0;
	}

	// Driver Code
	public static void main(String[] args) {

		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;

		// Function call
		subArraySum(arr, n, sum);
	}
}