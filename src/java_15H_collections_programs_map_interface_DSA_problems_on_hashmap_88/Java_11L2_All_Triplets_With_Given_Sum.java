package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find triplets having sum equal to
//target using hashing
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java_11L2_All_Triplets_With_Given_Sum {

	static List<List<Integer>> findTriplets(int[] arr, int target) {

		// Set to handle duplicates
		Set<List<Integer>> resSet = new HashSet<>();
		int n = arr.length;
		Map<Integer, List<int[]>> mp = new HashMap<>();

		// Store sum of all the pairs with their indices
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				mp.computeIfAbsent(arr[i] + arr[j], k -> new ArrayList<>()).add(new int[] { i, j });
			}
		}

		for (int i = 0; i < n; i++) {

			// Find remaining value to get sum equal to target
			int rem = target - arr[i];
			if (mp.containsKey(rem)) {
				List<int[]> pairs = mp.get(rem);
				for (int[] p : pairs) {

					// Ensure no two indices are same in triplet
					if (p[0] != i && p[1] != i) {
						List<Integer> curr = Arrays.asList(i, p[0], p[1]);
						Collections.sort(curr);
						resSet.add(curr);
					}
				}
			}
		}
		return new ArrayList<>(resSet);
	}

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;

		List<List<Integer>> ans = findTriplets(arr, target);
		for (List<Integer> triplet : ans) {
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
		}
	}
}