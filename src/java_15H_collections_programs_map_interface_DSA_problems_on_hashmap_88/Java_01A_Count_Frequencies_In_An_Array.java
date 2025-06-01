package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to count frequencies of array items

import java.util.Arrays;

public class Java_01A_Count_Frequencies_In_An_Array {

	public static void countFreq(int arr[], int n) {

		boolean visited[] = new boolean[n];

		Arrays.fill(visited, false);

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {

			// Skip this element if already processed
			if (visited[i] == true)
				continue;

			// Count frequency
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

//Driver code
	public static void main(String[] args) {
		
		int arr[] = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = arr.length;
		countFreq(arr, n);
	}
}
