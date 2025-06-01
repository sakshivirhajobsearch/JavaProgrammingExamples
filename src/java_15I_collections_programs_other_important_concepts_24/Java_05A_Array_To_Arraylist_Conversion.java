package java_15I_collections_programs_other_important_concepts_24;

//Java program to illustrate conversion 
//of an array to an ArrayList

import java.util.ArrayList;

public class Java_05A_Array_To_Arraylist_Conversion {

	public static void convertUsingAdd(int[] arr) {

		ArrayList<Integer> al = new ArrayList<>();

		// Manually adding array elements to the ArrayList
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}

		System.out.println(al);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		convertUsingAdd(arr);
	}
}