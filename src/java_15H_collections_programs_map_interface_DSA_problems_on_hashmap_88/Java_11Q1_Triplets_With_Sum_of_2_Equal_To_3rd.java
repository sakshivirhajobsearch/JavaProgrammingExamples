package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11Q1_Triplets_With_Sum_of_2_Equal_To_3rd {

	public static boolean findTriplet(int[] arr) {

		int n = arr.length;

		// Iterate through all possible triplets
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					// Check if sum of two elements equals the third element
					if (arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	// Driver Code with Predefined Input
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		if (findTriplet(arr))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
