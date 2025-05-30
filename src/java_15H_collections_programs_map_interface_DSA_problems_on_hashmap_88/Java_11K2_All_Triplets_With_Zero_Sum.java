package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find triplet having sum zero using 
//three nested loops

import java.util.ArrayList;
import java.util.List;

public class Java_11K2_All_Triplets_With_Zero_Sum {

	static ArrayList<ArrayList<Integer>> findTriplets(int[] arr) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int n = arr.length;

		// Generating all triplets
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {

					// If the sum of triplet equals to zero
					// then add it's indexes to the result
					if (arr[i] + arr[j] + arr[k] == 0) {
						ArrayList<Integer> triplet = new ArrayList<>();
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
		ArrayList<ArrayList<Integer>> res = findTriplets(arr);
		for (List<Integer> triplet : res)
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
	}
}
