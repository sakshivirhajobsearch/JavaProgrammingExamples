package java_15E_collections_programs_set_interface_39;

import java.util.LinkedHashSet;

public class Java_06B_LinkedHashSet_Class {

	public static void main(String[] args) {

		// Creating an empty LinkedHashSet
		LinkedHashSet<String> lh = new LinkedHashSet<String>();

		// Adding elements to above Set
		// using add() method
		lh.add("Geek");
		lh.add("For");
		lh.add("Geeks");

		System.out.println("LinkedHashSet : " + lh);
	}
}
