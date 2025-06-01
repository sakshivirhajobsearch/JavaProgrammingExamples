package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Program to count all pairs with difference equal to k
//using Hash Map

import java.util.HashMap;

public class Java_06C_Count_All_Pairs_With_Absolute_Difference_Equal_To_K {

	static int countPairs(int[] arr, int k) {

		int n = arr.length;
		HashMap<Integer, Integer> freq = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < n; i++) {

			// Check if the complement (arr[i] + k)
			// exists in the map. If yes, increment count
			if (freq.containsKey(arr[i] + k))
				cnt += freq.get(arr[i] + k);

			// Check if the complement (arr[i] - k)
			// exists in the map. If yes, increment count
			if (freq.containsKey(arr[i] - k))
				cnt += freq.get(arr[i] - k);

			// Increment the frequency of arr[i]
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 4, 1, 4, 5 };
		int k = 3;

		System.out.println(countPairs(arr, k));
	}
}