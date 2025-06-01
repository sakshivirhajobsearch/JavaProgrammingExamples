package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find minimum elements to remove 
//so no common element exists in both arrays using a single map

import java.util.HashMap;

public class Java_10B_Remove_Minimum_Elements_Such_That_No_Common_Elements_Exist_In_Two_Arrays {

	static int minRemove(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> count = new HashMap<>();
		int res = 0;

		// Count elements of arr1
		for (int num : arr1) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}

		// Count elements of arr2 and check common elements
		for (int num : arr2) {
			if (count.containsKey(num) && count.get(num) > 0) {
				count.put(num, count.get(num) - 1);
				res++;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 4, 5, 8 };

		System.out.println(minRemove(arr1, arr2));
	}
}