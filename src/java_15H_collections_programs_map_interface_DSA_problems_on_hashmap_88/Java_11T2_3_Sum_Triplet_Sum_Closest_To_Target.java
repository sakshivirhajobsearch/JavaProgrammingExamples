package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11T2_3_Sum_Triplet_Sum_Closest_To_Target {

	static int closest3Sum(int[] arr, int target) {

		int n = arr.length;
		int minDiff = Integer.MAX_VALUE;
		int res = 0;

		// Generating all possible triplets
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int currSum = arr[i] + arr[j] + arr[k];
					int currDiff = Math.abs(currSum - target);

					// if currentDiff is less than minDiff, it indicates
					// that this triplet is closer to the target
					if (currDiff < minDiff) {
						res = currSum;
						minDiff = currDiff;
					}
					// If multiple sums are closest, take maximum one
					else if (currDiff == minDiff) {
						res = Math.max(res, currSum);
					}
				}
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
