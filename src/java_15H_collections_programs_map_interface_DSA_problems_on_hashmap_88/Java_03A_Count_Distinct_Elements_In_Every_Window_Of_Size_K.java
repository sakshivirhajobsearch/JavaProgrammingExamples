package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to count distinct elements in every window
//of size k by traversing all windows of size k

import java.util.ArrayList;
import java.util.HashSet;

public class Java_03A_Count_Distinct_Elements_In_Every_Window_Of_Size_K {

	static ArrayList<Integer> countDistinct(int[] arr, int k) {

		int n = arr.length;
		ArrayList<Integer> res = new ArrayList<>();

		// Iterate over every window
		for (int i = 0; i <= n - k; i++) {

			// Hash Set to count unique elements
			HashSet<Integer> st = new HashSet<>();
			for (int j = i; j < i + k; j++)
				st.add(arr[j]);

			// Size of set denotes the number of unique elements
			// in the window
			res.add(st.size());
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
		int k = 4;

		ArrayList<Integer> res = countDistinct(arr, k);
		for (int ele : res)
			System.out.print(ele + " ");
	}
}