package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_13A_Longest_Subarray_Having_Majority_Elements_Greater_Than_K {

	static int longestSubarray(int[] arr, int k) {

		int n = arr.length;
		int res = 0;

		// Traverse through all subarrays
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = i; j < n; j++) {
				if (arr[j] > k)
					cnt++;
				else
					cnt--;

				// Update result with the maximum length
				if (cnt > 0)
					res = Math.max(res, j - i + 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1 };
		int k = 2;
		System.out.println(longestSubarray(arr, k));
	}
}