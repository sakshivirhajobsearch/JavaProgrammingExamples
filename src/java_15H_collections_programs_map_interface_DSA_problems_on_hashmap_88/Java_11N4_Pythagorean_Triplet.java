package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11N4_Pythagorean_Triplet {

	static boolean pythagoreanTriplet(int[] arr) {

		int n = arr.length;
		int maxEle = 0;
		for (int ele : arr)
			maxEle = Math.max(maxEle, ele);

		// Visited array to mark the elements
		boolean[] vis = new boolean[maxEle + 1];

		// Marking each element of input array
		for (int ele : arr)
			vis[ele] = true;

		// Iterate for all possible a
		for (int a = 1; a < maxEle + 1; a++) {

			// If a is not there
			if (!vis[a])
				continue;

			// Iterate for all possible b
			for (int b = 1; b < maxEle + 1; b++) {

				// If b is not there
				if (!vis[b])
					continue;

				// calculate c value to form a pythagorean triplet
				int c = (int) Math.sqrt(a * a + b * b);

				// If c^2 is not a perfect square or c exceeds the
				// maximum value
				if ((c * c) != (a * a + b * b) || c > maxEle)
					continue;

				// If there exists c in the original array,
				// we have found the triplet
				if (vis[c]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 6, 5 };
		System.out.println(pythagoreanTriplet(arr));
	}
}
