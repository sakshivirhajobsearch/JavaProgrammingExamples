package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Program to check for triplet sum using Hash Set

import java.util.HashSet;
import java.util.Set;

public class Java_11B_3_Sum_Count_All_Triplets_With_Target_Sum {

	static boolean hasTripletSum(int[] arr, int target) {

		int n = arr.length;

		// Fix the first element as arr[i]
		for (int i = 0; i < n - 2; i++) {

			// Hash set to store potential second elements
			Set<Integer> st = new HashSet<>();

			// Fix the third element as arr[j]
			for (int j = i + 1; j < n; j++) {
				int second = target - arr[i] - arr[j];

				// Search for second element in hash set
				if (st.contains(second)) {
					return true;
				}

				// Add arr[j] as a potential second element
				st.add(arr[j]);
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int target = 13;
		if (hasTripletSum(arr, target))
			System.out.println("true");
		else
			System.out.println("false");
	}
}