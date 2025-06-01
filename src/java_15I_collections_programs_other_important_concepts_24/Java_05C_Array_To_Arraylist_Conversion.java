package java_15I_collections_programs_other_important_concepts_24;

//Java program to illustrate conversion 
//of an array to an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Java_05C_Array_To_Arraylist_Conversion {

	public static void convertUsingAddAll(String[] arr) {

		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, arr);
		System.out.println(al);
	}

	public static void main(String[] args) {

		String[] arr = { "A", "B", "C", "D" };
		convertUsingAddAll(arr);
	}
}