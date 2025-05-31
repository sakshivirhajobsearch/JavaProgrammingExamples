package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_05A_2_Sum_Count_Pairs_With_Target_Sum {

	// Function to count all pairs whose sum is equal
	// to the given target value
	static int countPairs(int[] arr, int target) {
		
		int n = arr.length;
		int cnt = 0;

		// Iterate through each element in the array
		for (int i = 0; i < n; i++) {

			// For each element arr[i], check every
			// other element arr[j] that comes after it
			for (int j = i + 1; j < n; j++) {

				// Check if the sum of the current pair
				// equals the target
				if (arr[i] + arr[j] == target) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		System.out.println(countPairs(arr, target));
	}
}