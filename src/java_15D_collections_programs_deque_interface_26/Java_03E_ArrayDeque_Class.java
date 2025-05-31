package java_15D_collections_programs_deque_interface_26;

import java.util.ArrayDeque;
import java.util.Deque;

public class Java_03E_ArrayDeque_Class {

	public static void main(String[] args) {

		// Initializing a deque
		// since deque is an interface
		// it is assigned the
		// ArrayDeque class
		Deque<String> d = new ArrayDeque<String>();

		// add() method to insert
		d.add("The");
		d.addFirst("To");
		d.addLast("Geeks");

		// offer() method to insert
		d.offer("For");
		d.offerFirst("Welcome");
		d.offerLast("Geeks");

		System.out.println("ArrayDeque : " + d);
	}
}