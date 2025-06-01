package java_15E_collections_programs_set_interface_39;

import java.util.LinkedHashSet;

public class Java_06C_LinkedHashSet_Class {

	public static void main(String[] args) {

		// Creating an empty LinekdhashSet of string type
		LinkedHashSet<String> lh = new LinkedHashSet<String>();

		// Adding elements to above Set
		// using add() method
		lh.add("Geek");
		lh.add("For");
		lh.add("Geeks");
		lh.add("A");
		lh.add("B");
		lh.add("Z");

		System.out.println("" + lh);

		// Removing the element from above Set
		lh.remove("B");

		// Again removing the element
		System.out.println("After removing element " + lh);

		// Returning false if the element is not present
		System.out.println(lh.remove("AC"));
	}
}