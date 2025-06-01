package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.Arrays;

public class Java_01E_Count_Frequencies_In_An_Array {

	public static void countFreq(int[] arr, int n) {

		Arrays.sort(arr); // sort array for binary search

		for (int i = 0; i < n; i++) {
			// index of first and last occ of arr[i]
			int first_index = Arrays.binarySearch(arr, arr[i]);
			int last_index = Arrays.binarySearch(arr, arr[i]);

			while (first_index > 0 && arr[first_index - 1] == arr[i]) {
				first_index--;
			}

			while (last_index < n - 1 && arr[last_index + 1] == arr[i]) {
				last_index++;
			}

			i = last_index;

			int fre = last_index - first_index + 1;// finding frequency
			System.out.println(arr[i] + " " + fre);// printing frequency
		}
	}

	// Driver Code
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int size = arr.length;
		countFreq(arr, size);
	}
}