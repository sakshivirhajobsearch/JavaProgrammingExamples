package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find Pythagorean triplets 
//having given sum using three nested loops

import java.util.ArrayList;
import java.util.List;

public class Java_11O1_All_Pythagorean_Triplets {

	static List<List<Integer>> pythagoreanTriplet(int target) {

		List<List<Integer>> res = new ArrayList<>();

		// Generating all possible triplets
		for (int a = 0; a < target - 2; a++) {
			for (int b = a + 1; b < target - 1; b++) {
				for (int c = b + 1; c < target; c++) {

					// If this triplet satisfies the condition
					// then, add it to the result
					if (a + b + c == target && a * a + b * b == c * c) {
						res.add(List.of(a, b, c));
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int target = 60;
		List<List<Integer>> ans = pythagoreanTriplet(target);
		for (List<Integer> triplet : ans) {
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
		}
	}
}