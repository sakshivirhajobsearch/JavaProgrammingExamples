package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Program to count all pairs with difference equal to k
//using Two Pointer Technique

import java.util.Arrays;

public class Java_06B_Count_All_Pairs_With_Absolute_Difference_Equal_To_K {

	static int countPairs(int[] arr, int k) {

		int n = arr.length;
		int cnt = 0;

		Arrays.sort(arr);
		int i = 0, j = 0;

		while (j < n) {
			if (arr[j] - arr[i] < k)
				j++;

			// If difference is greater than k, decrease the
			// difference by moving i pointer towards right
			else if (arr[j] - arr[i] > k)
				i++;

			// If difference is equal to k, increase the difference
			// by moving j pointer towards right
			else {
				int ele1 = arr[i], ele2 = arr[j];
				int cnt1 = 0, cnt2 = 0;

				// Count frequency of first element of the pair
				while (j < n && arr[j] == ele2) {
					j++;
					cnt2++;
				}

				// Count frequency of second element of the pair
				while (i < n && arr[i] == ele1) {
					i++;
					cnt1++;
				}

				// If both the elements are same, then count of
				// pairs = the number of ways to choose 2
				// elements among cnt1 elements
				if (ele1 == ele2)
					cnt += (cnt1 * (cnt1 - 1)) / 2;

				// If the elements are different, then count of
				// pairs = product of the count of both elements
				else
					cnt += (cnt1 * cnt2);
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