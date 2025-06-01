package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find the most frequent element in an array.

import java.util.Arrays;

public class Java_02B_Most_Frequent_Element {

	// Function to find the most
	// frequent element in an array.
	static int mostFreqEle(int[] arr) {

		// Sort the array
		Arrays.sort(arr);

		// Find the max frequency using linear traversal
		int maxCnt = 1, res = arr[0], currCnt = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				currCnt++;
			else
				currCnt = 1;

			if (currCnt > maxCnt || (currCnt == maxCnt && arr[i] > res)) {
				maxCnt = currCnt;
				res = arr[i];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		System.out.println(mostFreqEle(arr));
	}
}