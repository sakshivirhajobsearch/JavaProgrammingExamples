package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Program to find max distance between two occurrences
//in array using hashing
import java.util.HashMap;

public class Java_08B_Max_Distance_Between_Two_Occurrences_In_Array {

	static int maxDistance(int[] arr) {

		// Stores element to first index mapping
		HashMap<Integer, Integer> mp = new HashMap<>();
		int res = 0;

		for (int i = 0; i < arr.length; i++) {

			// If this is the first occurrence of the
			// element, store its index
			if (!mp.containsKey(arr[i]))
				mp.put(arr[i], i);

			// Else update max distance
			else
				res = Math.max(res, i - mp.get(arr[i]));
		}

		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 1 };
		System.out.println(maxDistance(arr));
	}
}