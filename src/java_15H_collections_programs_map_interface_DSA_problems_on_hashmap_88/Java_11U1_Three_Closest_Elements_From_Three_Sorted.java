package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11U1_Three_Closest_Elements_From_Three_Sorted {

	public static void findClosest(int[] A, int[] B, int[] C, int p, int q, int r) {

		// Three variable to store answer
		int a = 0, b = 0, c = 0;

		// To Store minimum of
		// max(abs(A[i]-B[j]),abs(B[j]-C[k]),
		// abs(C[k]-A[i]))
		int ans = Integer.MAX_VALUE;

		// Run three nested loop
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				for (int k = 0; k < r; k++) {
					int curr = Math.max(Math.abs(A[i] - B[j]), Math.abs(B[j] - C[k]));
					int temp = Math.max(curr, Math.abs(C[k] - A[i]));

					// If that is minimum than previous then
					// update answer
					if (temp < ans) {
						ans = temp;
						a = A[i];
						b = B[j];
						c = C[k];
					}
				}
			}
		}
		// Printing final answer
		System.out.println(a + " " + b + " " + c);
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
