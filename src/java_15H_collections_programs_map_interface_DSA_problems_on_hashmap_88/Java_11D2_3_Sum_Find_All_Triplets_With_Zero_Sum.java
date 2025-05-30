package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find all triplets with zero sum
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Java_11D2_3_Sum_Find_All_Triplets_With_Zero_Sum {

	// Function to find all triplets with zero sum
	static List<List<Integer>> findTriplets(int[] arr) {

		// Map to store indices for each value
		HashMap<Integer, List<Integer>> map = new HashMap<>();

		// Resultant list
		List<List<Integer>> ans = new ArrayList<>();

		// Check for all pairs i, j
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {

				// Value of third index should be
				int val = -1 * (arr[j] + arr[k]);

				// If such indices exist
				if (map.containsKey(val)) {

					// Append the i, j, k
					for (int i : map.get(val)) {
						ans.add(Arrays.asList(i, j, k));
					}
				}
			}

			// After j'th index is traversed
			// We can use it as i.
			map.putIfAbsent(arr[j], new ArrayList<>());
			map.get(arr[j]).add(j);
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		List<List<Integer>> res = findTriplets(arr);
		for (List<Integer> triplet : res) {
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
		}
	}
}
