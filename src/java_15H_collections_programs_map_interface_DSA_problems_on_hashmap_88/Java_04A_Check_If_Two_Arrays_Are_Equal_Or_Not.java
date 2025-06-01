package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.Arrays;

public class Java_04A_Check_If_Two_Arrays_Are_Equal_Or_Not {

	static boolean checkEqual(int[] a, int[] b) {

		// If lengths of array are not equal means
		// array are not equal
		if (a.length != b.length)
			return false;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		// If all elements were same.
		return true;
	}

	public static void main(String[] args) {
		
		int[] a = { 3, 5, 2, 5, 2 };
		int[] b = { 2, 3, 5, 5, 2 };
		if (checkEqual(a, b))
			System.out.println("true");
		else
			System.out.println("false");
	}
}