package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11G1_3_Sum_Pythagorean_Triplet_In_An_Array {

	static boolean pythagoreanTriplet(int[] arr) {

		int n = arr.length;

		// Exploring all possible triplets
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {

					// Calculate square of array elements
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];

					// If these integers form Pythagorean triplet then
					// return true
					if (x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 6, 5 };
		System.out.println(pythagoreanTriplet(arr));
	}
}