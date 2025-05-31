package java_15D_collections_programs_deque_interface_26;

import java.util.Iterator;
//Java Program to demonstrates 
//the working of iterator()
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02F_ConcurrentLinkedDeque_Class {

	public static void main(String args[]) {

		// Create an empty ConcurrentLinkedDeque
		ConcurrentLinkedDeque<String> d = new ConcurrentLinkedDeque<>();

		// Add elements to the d
		d.add("Java");
		d.add("C++");
		d.add("Python");
		d.add("Js");

		// Display the d
		System.out.println("Deque: " + d);

		// Create an iterator for the d
		Iterator<String> i = d.iterator();

		// Display the elements using the iterator
		System.out.println("Iterating over the elements of ConcurrentLinkedDeque: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}