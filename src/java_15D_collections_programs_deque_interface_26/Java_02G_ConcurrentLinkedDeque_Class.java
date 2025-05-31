package java_15D_collections_programs_deque_interface_26;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02G_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		// Create an empty ConcurrentLinkedDeque
		ConcurrentLinkedDeque<String> d = new ConcurrentLinkedDeque<>();

		// Add elements to the d
		d.add("Java");
		d.add("C++");
		d.add("Python");
		d.add("Js");

		// Display the elements in the d
		System.out.println("Deque: " + d);

		// Display the first element
		System.out.println("First element: " + d.getFirst());

		// Display the last element
		System.out.println("Last element: " + d.getLast());

		// Display the head of the d
		System.out.println("Head of deque: " + d.element());
	}
}