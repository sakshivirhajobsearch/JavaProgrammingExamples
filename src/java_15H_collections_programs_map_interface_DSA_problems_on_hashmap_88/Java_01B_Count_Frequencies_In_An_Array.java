package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to count frequencies of array items
import java.util.HashMap;
import java.util.Map;

public class Java_01B_Count_Frequencies_In_An_Array {

	static void countFreq(int arr[], int n) {
		
		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		// Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = arr.length;
		countFreq(arr, n);
	}
}

//This code contributed by Rajput-Ji