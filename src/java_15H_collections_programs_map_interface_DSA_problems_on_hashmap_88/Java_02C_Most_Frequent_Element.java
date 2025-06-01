package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find the most frequent element in an array.

import java.util.HashMap;

public class Java_02C_Most_Frequent_Element {

	// Function to find the most
	// frequent element in an array.
	static int mostFreqEle(int[] arr) {
		int n = arr.length;

		// Insert all elements in hash map.
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < n; i++)
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

		// find the max frequency
		int maxCnt = 0, res = -1;
		for (var entry : freq.entrySet()) {
			int val = entry.getKey(), cnt = entry.getValue();
			if (maxCnt < cnt || (cnt == maxCnt && val > res)) {
				res = val;
				maxCnt = cnt;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		System.out.println(mostFreqEle(arr));
	}
}