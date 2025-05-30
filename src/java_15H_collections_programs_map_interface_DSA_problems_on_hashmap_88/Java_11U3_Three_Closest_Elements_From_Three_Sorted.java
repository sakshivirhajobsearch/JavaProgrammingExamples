package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.Arrays;

public class Java_11U3_Three_Closest_Elements_From_Three_Sorted {

	public static void findClosest(int[] A, int[] B, int[] C, int p, int q, int r) {

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int diff = Integer.MAX_VALUE; // Initialize min diff

		// Initialize result
		int res_i = 0, res_j = 0, res_k = 0;

		// Traverse arrays
		int i = 0, j = 0, k = 0;
		while (i < p && j < q && k < r) {
			// Find minimum and maximum of current three elements
			int minimum = Math.min(A[i], Math.min(B[j], C[k]));
			int maximum = Math.max(A[i], Math.max(B[j], C[k]));

			// Calculate the maximum difference for the current combination
			int curDiff = Math.abs(maximum - minimum);

			// Update result if current diff is less than the min
			// diff so far
			if (curDiff < diff) {
				res_i = i;
				res_j = j;
				res_k = k;
				diff = curDiff;
			}

			// If the maximum element of A is the smallest among the three,
			// we move the A pointer forward
			if (A[i] == minimum && A[i] <= B[j] && A[i] <= C[k])
				i++;

			// If the maximum element of B is the smallest among the three,
			// we move the B pointer forward
			else if (B[j] == minimum && B[j] <= A[i] && B[j] <= C[k])
				j++;

			// If the maximum element of C is the smallest among the three,
			// we move the C pointer forward
			else
				k++;
		}

		// Print result
		System.out.println(A[res_i] + " " + B[res_j] + " " + C[res_k]);
	}

// Driver program
	public static void main(String[] args) {

		int[] A = { 1, 4, 10 };
		int[] B = { 2, 15, 20 };
		int[] C = { 10, 12 };

		int p = A.length;
		int q = B.length;
		int r = C.length;

		findClosest(A, B, C, p, q, r);
	}
}
