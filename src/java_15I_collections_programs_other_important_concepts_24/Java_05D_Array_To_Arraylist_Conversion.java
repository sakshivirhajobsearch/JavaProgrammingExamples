package java_15I_collections_programs_other_important_concepts_24;

//Java program to illustrate conversion 
//of an array to an ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Java_05D_Array_To_Arraylist_Conversion {

	public static void convertUsingStream(String[] arr) {

		ArrayList<String> al = (ArrayList<String>) Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(al);
	}

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "C++" };
		convertUsingStream(arr);
	}
}