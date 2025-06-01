package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find all triplets having sum equal to
//target by exploring all possible triplets

import java.util.ArrayList;
import java.util.List;

public class Java_11E1_3_Sum_Find_all_Triplets_With_Given_Sum {

	static List<List<Integer>> findTriplets(int[] arr, int target) {

		List<List<Integer>> res = new ArrayList<>();
		int n = arr.length;

		// Generating all triplets
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {

					// If the sum of triplet is equal to target
					// then add it's indices to the result
					if (arr[i] + arr[j] + arr[k] == target) {
						List<Integer> triplet = new ArrayList<>();
						triplet.add(i);
						triplet.add(j);
						triplet.add(k);
						res.add(triplet);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;

		List<List<Integer>> ans = findTriplets(arr, target);
		for (List<Integer> triplet : ans)
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
	}
}