package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find a maximum product of a
//triplet in array of integers using sorting
import java.util.Arrays;

public class Java_11Z2_Maximum_Product_Of_A_Triplet {
	/*
	 * Function to find a maximum product of a triplet in array of integers of size
	 * n
	 */
	static int maxProduct(int[] arr) {
		int n = arr.length;

		// Sort the array in ascending order
		Arrays.sort(arr);

		// Return the maximum of product of last three
		// elements and product of first two elements
		// and last element
		return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);
	}

	public static void main(String[] args) {

		int[] arr = { -10, -3, 5, 6, -20 };
		int max = maxProduct(arr);
		System.out.println(max);
	}
}
