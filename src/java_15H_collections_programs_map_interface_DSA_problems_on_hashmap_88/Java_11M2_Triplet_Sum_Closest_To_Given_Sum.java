package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find triplet sum closest to target using
//sorting and two pointers
import java.util.Arrays;

public class Java_11M2_Triplet_Sum_Closest_To_Given_Sum {

	static int closest3Sum(int[] arr, int target) {

		int n = arr.length;
		Arrays.sort(arr);
		int res = 0;
		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < n - 2; i++) {

			// Initialize the left and right pointers
			int l = i + 1, r = n - 1;

			while (l < r) {
				int currSum = arr[i] + arr[l] + arr[r];

				// If |currSum - target| < minDiff, then we have
				// found a triplet which is closer to target
				if (Math.abs(currSum - target) < minDiff) {
					minDiff = Math.abs(currSum - target);
					res = currSum;
				}
				// If multiple sums are closest, take maximum one
				else if (Math.abs(currSum - target) == minDiff) {
					res = Math.max(res, currSum);
				}

				// If currSum > target then we will decrease the
				// right pointer to move closer to target
				if (currSum > target)
					r--;

				// If currSum <= target then we will increase the
				// left pointer to move closer to target
				else
					l++;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		int[] arr = { -1, 2, 2, 4 };
		int target = 4;
		System.out.println(closest3Sum(arr, target));
	}
}
