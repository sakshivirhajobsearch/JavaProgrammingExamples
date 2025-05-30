package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find all unique triplets having sum
//equal to target using hashing
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java_11S2_3_Sum_All_Distinct_Triplets_With_Given_Sum_In_An_Array {

	static List<List<Integer>> threeSum(int[] arr, int target) {

		int n = arr.length;

		// Set to handle duplicates
		Set<List<Integer>> resSet = new HashSet<>();

		// Generating all pairs
		for (int i = 0; i < n; i++) {
			Set<Integer> s = new HashSet<>();
			for (int j = i + 1; j < n; j++) {
				int complement = target - arr[i] - arr[j];

				// If the complement exists in the hash set then we
				// have found the triplet with sum, target
				if (s.contains(complement)) {
					List<Integer> curr = Arrays.asList(arr[i], arr[j], complement);
					Collections.sort(curr);
					resSet.add(curr);
				}

				s.add(arr[j]);
			}
		}

		return new ArrayList<>(resSet);
	}

	public static void main(String[] args) {

		int[] arr = { 12, 3, 6, 1, 6, 9 };
		int target = 24;

		List<List<Integer>> ans = threeSum(arr, target);
		for (List<Integer> triplet : ans) {
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
		}
	}
}