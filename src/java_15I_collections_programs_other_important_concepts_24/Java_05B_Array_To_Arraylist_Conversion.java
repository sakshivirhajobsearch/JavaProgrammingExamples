package java_15I_collections_programs_other_important_concepts_24;

//Java program to illustrate conversion
//of an array to an ArrayList

import java.util.ArrayList;
import java.util.Arrays;

public class Java_05B_Array_To_Arraylist_Conversion {

	public static void convertUsingAsList(Integer[] arr) {

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
	}

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };
		convertUsingAsList(arr);
	}
}