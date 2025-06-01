package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.HashMap;

//Java Program to count pairs with given sum
//using Hash Map

import java.util.Map;

public class Java_05B_2_Sum_Count_Pairs_With_Target_Sum {

	// Returns number of pairs in arr[0...n-1] with
	// sum equal to 'target'
	static int countPairs(int[] arr, int target) {

		Map<Integer, Integer> freq = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			// Check if the complement (target - arr[i])
			// exists in the map. If yes, increment count
			if (freq.containsKey(target - arr[i])) {
				cnt += freq.get(target - arr[i]);
			}

			// Increment the frequency of arr[i]
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		System.out.println(countPairs(arr, target));
	}
}