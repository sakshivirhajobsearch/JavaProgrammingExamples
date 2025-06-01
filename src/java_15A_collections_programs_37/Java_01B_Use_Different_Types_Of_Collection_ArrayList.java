package java_15A_collections_programs_37;

import java.util.ArrayList;

public class Java_01B_Use_Different_Types_Of_Collection_ArrayList {

	// Main Method
	public static void main(String[] args) {

		// Declaring the ArrayList with
		// initial size n
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);

		// Printing elements
		System.out.println(al);

		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");
	}
}
