package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find Pythagorean triplets having given sum
//using two nested loops

import java.util.ArrayList;
import java.util.List;

public class Java_11I2_Pythagorean_Triplet_With_Given_Sum {

	static List<List<Integer>> pythagoreanTriplet(int target) {

		List<List<Integer>> res = new ArrayList<>();

		// Generating all possible pairs
		for (int a = 1; a < target - 2; a++) {
			for (int b = a + 1; b < target - 1; b++) {

				// Third value of the triplet
				int c = target - a - b;

				// c should be the maximum value of the triplet
				if (c <= b)
					continue;

				// If {a, b, c} forms a Pythagorean triplet
				// then add it to the result
				if (a * a + b * b == c * c)
					res.add(List.of(a, b, c));
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
