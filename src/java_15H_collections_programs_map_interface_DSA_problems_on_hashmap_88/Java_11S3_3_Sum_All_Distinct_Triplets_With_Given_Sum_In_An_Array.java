package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find all the distinct triplets having sum
//equal to target using two pointer technique
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_11S3_3_Sum_All_Distinct_Triplets_With_Given_Sum_In_An_Array {

	static List<List<Integer>> threeSum(int[] arr, int target) {

		List<List<Integer>> res = new ArrayList<>();
		int n = arr.length;

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {

			// Skip duplicates for i
			if (i > 0 && arr[i] == arr[i - 1])
				continue;

			// Two pointer technique
			int j = i + 1, k = n - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum == target) {
					List<Integer> curr = Arrays.asList(arr[i], arr[j], arr[k]);
					res.add(curr);
					j++;
					k--;

					// Skip duplicates for j and k
					while (j < n && arr[j] == arr[j - 1])
						j++;
					while (k > j && arr[k] == arr[k + 1])
						k--;
				} else if (sum < target) {
					j++;
				} else {
					k--;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 3, 6, 1, 6, 9 };
		int target = 24;

		List<List<Integer>> ans = threeSum(arr, target);
		for (List<Integer> triplet : ans) {
			System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
		}
	}
}
