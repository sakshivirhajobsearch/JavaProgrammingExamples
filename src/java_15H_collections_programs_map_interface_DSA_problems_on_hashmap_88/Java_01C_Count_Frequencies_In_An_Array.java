package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to count frequencies of array items 

import java.util.HashMap;
import java.util.Map;

public class Java_01C_Count_Frequencies_In_An_Array {

	static void countFreq(int arr[], int n) {

		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
		}

		// To print elements according to first
		// occurrence, traverse array one more time
		// print frequencies of elements and mark
		// frequencies as -1 so that same element
		// is not printed multiple times.
		for (int i = 0; i < n; i++) {
			if (mp.get(arr[i]) != -1) {
				System.out.println(arr[i] + " " + mp.get(arr[i]));
				mp.put(arr[i], -1);
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = arr.length;
		countFreq(arr, n);
	}
}

//This code contributed by Rajput-Ji