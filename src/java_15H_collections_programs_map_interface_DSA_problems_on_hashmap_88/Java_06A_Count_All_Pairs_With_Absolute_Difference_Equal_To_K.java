package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Program to count all pairs with difference equal to k
//by generating all pairs

public class Java_06A_Count_All_Pairs_With_Absolute_Difference_Equal_To_K {

	static int countPairs(int[] arr, int k) {

		int n = arr.length;
		int cnt = 0;

		// generate all possible pairs
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				// If absolute difference = k, then increment
				// count by 1
				if (Math.abs(arr[i] - arr[j]) == k) {
					cnt += 1;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 4, 1, 4, 5 };
		int k = 3;

		System.out.println(countPairs(arr, k));
	}
}
