package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java Code to Remove minimum number of elements
//such that no common element exist in both array
import java.util.HashMap;

public class Java_10A_Remove_Minimum_Elements_Such_That_No_Common_Elements_Exist_In_Two_Arrays {

	static int minRemove(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> countA = new HashMap<>();
		HashMap<Integer, Integer> countB = new HashMap<>();
		int res = 0;

		// Count elements of arr1
		for (int num : arr1) {
			countA.put(num, countA.getOrDefault(num, 0) + 1);
		}

		// Count elements of arr2
		for (int num : arr2) {
			countB.put(num, countB.getOrDefault(num, 0) + 1);
		}

		// Traverse through all common elements, and pick minimum
		// occurrence from two arrays
		for (int key : countA.keySet()) {
			if (countB.containsKey(key)) {
				res += Math.min(countA.get(key), countB.get(key));
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