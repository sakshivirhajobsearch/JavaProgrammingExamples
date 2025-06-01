package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Code to find longest Subarray With Sum Divisible
//By K using Prefix Sum and Hash map

import java.util.HashMap;
import java.util.Map;

public class Java_12B_Longest_Subarray_With_Sum_Divisible_By_K {

	static int longestSubarrayDivK(int[] arr, int k) {

		int n = arr.length, res = 0;
		Map<Integer, Integer> prefIdx = new HashMap<>();
		int sum = 0;

		// Iterate over all ending points
		for (int i = 0; i < n; i++) {

			// prefix sum mod k (handling negative prefix sum)
			sum = ((sum + arr[i]) % k + k) % k;

			// If sum == 0, then update result with the
			// length of subarray arr[0...i]
			if (sum == 0)
				res = i + 1;

			// Update max length for repeating sum
			else if (prefIdx.containsKey(sum)) {
				res = Math.max(res, i - prefIdx.get(sum));
			}

			// Store the first occurrence of sum
			else {
				prefIdx.put(sum, i);
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