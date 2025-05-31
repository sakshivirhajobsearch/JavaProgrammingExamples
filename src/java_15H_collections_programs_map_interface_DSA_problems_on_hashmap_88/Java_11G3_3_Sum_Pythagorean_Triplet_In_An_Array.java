package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find if a Pythagorean triplet exists 
//using hashing

import java.util.HashSet;

public class Java_11G3_3_Sum_Pythagorean_Triplet_In_An_Array {

	static boolean pythagoreanTriplet(int[] arr) {

		int n = arr.length;
		HashSet<Integer> st = new HashSet<>();
		for (int i = 0; i < n; i++)
			st.add(arr[i]);

		// Iterate through all possible values of a and b
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				int a = arr[i];
				int b = arr[j];

				// calculate required value for
				// c to form Pythagorean triplet
				int c = (int) Math.sqrt(a * a + b * b);

				// First, verify if c^2 is a perfect square (indicating a
				// valid c) and check if this c exists in the set.
				if (c * c == a * a + b * b && st.contains(c))
					return true;
			}
		}

		// No Pythagorean triplet exists in the array
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 6, 5 };
		System.out.println(pythagoreanTriplet(arr));
	}
}
