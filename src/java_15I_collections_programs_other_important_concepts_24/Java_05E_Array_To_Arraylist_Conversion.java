package java_15I_collections_programs_other_important_concepts_24;

//Java program to illustrate conversion 
//of an array to an ArrayList

import java.util.ArrayList;
import java.util.List;

public class Java_05E_Array_To_Arraylist_Conversion {

	public static void convertUsingListOf(String[] arr) {

		ArrayList<String> al = new ArrayList<>(List.of(arr));
		System.out.println(al);
	}

	public static void main(String[] args) {

		String[] arr = { "Geek1", "Geek2", "Geek3" };
		convertUsingListOf(arr);
	}
}
