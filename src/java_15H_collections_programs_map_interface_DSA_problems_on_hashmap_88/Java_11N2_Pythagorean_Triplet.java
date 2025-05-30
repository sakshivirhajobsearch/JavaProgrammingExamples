package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find if a Pythagorean triplet  
//exists using the two-pointer technique

import java.util.Arrays;

public class Java_11N2_Pythagorean_Triplet {

	static boolean pythagoreanTriplet(int[] arr) {

		int n = arr.length;

		// Taking Square of each element
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		Arrays.sort(arr);

		// Fix the largest element of Pythagorean triplet
		for (int i = n - 1; i > 1; i--) {

			// Two pointer technique to find remaining two
			// elements Such that a^2 + b^2 = c^2
			int l = 0;
			int r = i - 1;
			while (l < r) {

				// A Pythagorean triplet is found
				if (arr[l] + arr[r] == arr[i])
					return true;

				if (arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 6, 5 };
		System.out.println(pythagoreanTriplet(arr));

	}
}
