package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Code to find the length of longest subarray
//in which count of elements > k is more than count
//of elements < k using hash map
import java.util.HashMap;
import java.util.Map;

public class Java_13B_Longest_Subarray_Having_Majority_Elements_Greater_Than_K {

	static int longestSubarray(int[] arr, int k) {

		int n = arr.length;
		Map<Integer, Integer> prefIdx = new HashMap<>();
		int sum = 0, res = 0;

		// Traverse through all elements
		for (int i = 0; i < n; i++) {

			// Consider arr[i] <= k as -1 and arr[i] > k as +1
			sum += (arr[i] > k ? 1 : -1);

			// make an entry for sum if it is not present
			// in the hash map
			if (!prefIdx.containsKey(sum))
				prefIdx.put(sum, i);
		}

		// If all elements are smaller than k, return 0
		if (prefIdx.containsKey(-n))
			return 0;

		prefIdx.put(-n, n);

		// For each sum i, update prefIdx[i] with
		// min(prefIdx[-n], prefIdx[-n+1] .... pref[i])
		for (int i = -n + 1; i <= n; i++) {
			if (!prefIdx.containsKey(i))
				prefIdx.put(i, prefIdx.get(i - 1));
			else
				prefIdx.put(i, Math.min(prefIdx.get(i), prefIdx.get(i - 1)));
		}

		// To find the longest subarray with sum > 0 ending at i,
		// we need left-most occurrence of s' such that s' < s.
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (arr[i] > k ? 1 : -1);
			if (sum > 0)
				res = i + 1;
			else
				res = Math.max(res, i - prefIdx.get(sum - 1));
		}

		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1 };
		int k = 2;
		System.out.println(longestSubarray(arr, k));
	}
}
