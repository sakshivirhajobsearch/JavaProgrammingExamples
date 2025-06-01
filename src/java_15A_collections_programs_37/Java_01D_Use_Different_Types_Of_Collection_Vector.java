package java_15A_collections_programs_37;

import java.util.Vector;

public class Java_01D_Use_Different_Types_Of_Collection_Vector {

	// Main Method
	public static void main(String[] args) {

		// Declaring the Vector
		Vector<Integer> v = new Vector<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			v.add(i);

		// Printing elements
		System.out.println(v);

		// Remove element at index 3
		v.remove(3);

		// Displaying the Vector
		// after deletion
		System.out.println(v);

		// Printing elements one by one
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");
	}
}
