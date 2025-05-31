package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.TreeSet;

public class Java_11Y2_Maximum_Sum_Triplet {

	// Function to calculate maximum triplet sum
	public static int maxTripletSum(int arr[], int n) {

		// Initialize suffix-array
		int maxSuffArr[] = new int[n + 1];

		// Set the last element
		maxSuffArr[n] = 0;

		// Calculate suffix-array containing maximum
		// value for index i, i+1, i+2, ... n-1 in
		// arr[i]
		for (int i = n - 1; i >= 0; --i)
			maxSuffArr[i] = Math.max(maxSuffArr[i + 1], arr[i]);

		int ans = 0;

		// Initialize set container
		TreeSet<Integer> lowValue = new TreeSet<Integer>();

		// Insert minimum value for first comparison
		// in the set
		lowValue.add(Integer.MIN_VALUE);

		for (int i = 0; i < n - 1; ++i) {
			if (maxSuffArr[i + 1] > arr[i]) {
				int left = lowValue.lower(arr[i]);
				if (left == Integer.MIN_VALUE) {
					// Insert arr[i] in set<> for further
					// processing
					lowValue.add(arr[i]);
					continue;
				}
				ans = Math.max(ans, left + arr[i] + maxSuffArr[i + 1]);

				// Insert arr[i] in set<> for further
				// processing
				lowValue.add(arr[i]);
			}
		}
		return ans;
	}

	// Driver Code
	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 1, 4, 9 };
		int n = arr.length;

		System.out.println(maxTripletSum(arr, n));
	}
}
