package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_07C_Check_If_Array_Pair_Sums_Divisible_By_K {

	public static boolean canPairs(int[] arr, int k) {

		if (arr.length % 2 != 0)
			return false;

		// Create a frequency array of size k
		int[] freq = new int[k];

		for (int x : arr) {
			int rem = x % k;

			// If the complement of the current
			// remainder exists in freq, decrement
			// its count
			if (freq[(k - rem) % k] != 0)
				freq[(k - rem) % k]--;

			// Otherwise, increment the count of
			// the current remainder
			else
				freq[rem]++;
		}

		// Check if all elements in the frequency
		// array are 0
		for (int count : freq) {
			if (count != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
		int[] arr = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		System.out.println(canPairs(arr, k) ? "True" : "False");
	}
}