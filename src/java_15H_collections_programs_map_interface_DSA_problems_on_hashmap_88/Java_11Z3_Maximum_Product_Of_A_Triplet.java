package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_11Z3_Maximum_Product_Of_A_Triplet {

	/*
	 * Function to find a maximum product of a triplet in array of integers of size
	 * n
	 */
	static int maxProduct(int[] arr) {
		int n = arr.length;

		// Initialize Maximum,
		// second maximum and third maximum element
		int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;

		// Initialize Minimum and second minimum element
		int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {

			// Update Maximum, second maximum
			// and third maximum element
			if (arr[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = arr[i];
			} else if (arr[i] > maxB) {
				maxC = maxB;
				maxB = arr[i];
			} else if (arr[i] > maxC) {
				maxC = arr[i];
			}

			// Update Minimum and second minimum element
			if (arr[i] < minA) {
				minB = minA;
				minA = arr[i];
			} else if (arr[i] < minB) {
				minB = arr[i];
			}
		}

		return Math.max(minA * minB * maxA, maxA * maxB * maxC);
	}

	public static void main(String[] args) {

		int[] arr = { -10, -3, 5, 6, -20 };
		System.out.println(maxProduct(arr));
	}
}
