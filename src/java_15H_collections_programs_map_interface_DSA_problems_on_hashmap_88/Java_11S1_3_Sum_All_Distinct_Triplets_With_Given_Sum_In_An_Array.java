package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find all the distinct triplets having sum
//equal to given target by exploring all the triplets
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_11S1_3_Sum_All_Distinct_Triplets_With_Given_Sum_In_An_Array {

	public static List<List<Integer>> threeSum(int[] arr, int target) {

		List<List<Integer>> res = new ArrayList<>();
		int n = arr.length;

		// Generating all possible triplets
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						List<Integer> curr = Arrays.asList(arr[i], arr[j], arr[k]);
						Collections.sort(curr);

						// If triplet doesn't exist in the res, then only insert it.
						if (!res.contains(curr)) {
							res.add(curr);
						}
					}
				}
			}
		}
		return res;
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