package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//A Simple Java program to count triplets with sum smaller
//than a given value

public class Java_11X1_Count_Triplets_With_Smaller_Sum {

	static int arr[] = new int[] { 5, 1, 3, 4, 7 };

	static int countTriplets(int n, int sum) {
		// Initialize result
		int ans = 0;

		// Fix the first element as A[i]
		for (int i = 0; i < n - 2; i++) {
			// Fix the second element as A[j]
			for (int j = i + 1; j < n - 1; j++) {
				// Now look for the third number
				for (int k = j + 1; k < n; k++)
					if (arr[i] + arr[j] + arr[k] < sum)
						ans++;
			}
		}

		return ans;
	}

	// Driver method to test the above function
	public static void main(String[] args) {

		int sum = 12;
		System.out.println(countTriplets(arr.length, sum));
	}
}
