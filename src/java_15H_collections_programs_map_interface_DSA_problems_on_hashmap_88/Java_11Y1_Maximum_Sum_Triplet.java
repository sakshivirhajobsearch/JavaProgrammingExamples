package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11Y1_Maximum_Sum_Triplet {

	// Function to calculate maximum triplet sum
	static int maxTripletSum(int arr[], int n) {
		// Initialize the answer
		int ans = 0;

		for (int i = 1; i < n - 1; ++i) {
			int max1 = 0, max2 = 0;

			// find maximum value(less than arr[i])
			// from 0 to i-1
			for (int j = 0; j < i; ++j)
				if (arr[j] < arr[i])
					max1 = Math.max(max1, arr[j]);

			// find maximum value(greater than arr[i])
			// from i+1 to n-1
			for (int j = i + 1; j < n; ++j)
				if (arr[j] > arr[i])
					max2 = Math.max(max2, arr[j]);

			// store maximum answer
			if (max1 > 0 && max2 > 0)
				ans = Math.max(ans, max1 + arr[i] + max2);
		}

		return ans;
	}

	// Driver code
	public static void main(String args[]) {

		int arr[] = { 2, 5, 3, 1, 4, 9 };
		int n = arr.length;
		System.out.println(maxTripletSum(arr, n));
	}
}
