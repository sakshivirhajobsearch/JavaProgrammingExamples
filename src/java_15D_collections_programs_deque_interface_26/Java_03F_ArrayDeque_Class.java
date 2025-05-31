package java_15D_collections_programs_deque_interface_26;

import java.util.ArrayDeque;

public class Java_03F_ArrayDeque_Class {

	public static void main(String args[]) {

		// Creating an empty ArrayDeque
		ArrayDeque<String> d = new ArrayDeque<String>();

		// Using add() method to add elements into the Deque
		// Custom input elements
		d.add("Welcome");
		d.add("To");
		d.add("Geeks");
		d.add("for");
		d.add("Geeks");

		// Displaying the ArrayDeque
		System.out.println("ArrayDeque: " + d);

		// Displaying the First element
		System.out.println("The first element is: " + d.getFirst());

		// Displaying the Last element
		System.out.println("The last element is: " + d.getLast());
	}
}