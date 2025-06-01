package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_12A_Longest_Subarray_With_Sum_Divisible_By_K {

	static int longestSubarrayDivK(int[] arr, int k) {

		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			// Initialize sum for the current subarray
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				// Add the current element to the subarray sum
				sum = (sum + arr[j]) % k;

				// Update max length if sum is divisible by k
				if (sum == 0)
					res = Math.max(res, j - i + 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 6, 1, 4, 5 };
		int k = 3;

		System.out.println(longestSubarrayDivK(arr, k));
	}
}