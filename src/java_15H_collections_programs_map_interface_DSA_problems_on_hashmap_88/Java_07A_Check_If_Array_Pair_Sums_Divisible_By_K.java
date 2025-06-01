package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_07A_Check_If_Array_Pair_Sums_Divisible_By_K {

	public static boolean canPairs(int[] arr, int k) {

		int n = arr.length;

		if (n % 2 == 1)
			return false;

		int count = 0;

		boolean[] vis = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				// If pair is divisible increment the
				// count and mark elements as visited
				if ((arr[i] + arr[j]) % k == 0 && !vis[i] && !vis[j]) {

					count++;
					vis[i] = true;
					vis[j] = true;
				}
			}
		}

		return (count == n / 2);
	}

	public static void main(String[] args) {

		int[] arr = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		System.out.println(canPairs(arr, k) ? "True" : "False");
	}
}