package java_15A_collections_programs_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_03A_Compare_Elements_In_A_Collection {

	public static void main(String[] args) {

		// List initialization
		List<Integer> l = new ArrayList<>();

		// Add elements in the list
		l.add(3);
		l.add(5);
		l.add(18);
		l.add(4);
		l.add(6);

		// Minimum in the list
		int minimum = Collections.min(l);

		// Maximum in the list
		int maximum = Collections.max(l);

		if (minimum == maximum) {
			System.out.println("All elements are equal");
		} else {
			System.out.println("Min value of our list : " + minimum);
			System.out.println("Max value of our list : " + maximum);
		}
	}
}
