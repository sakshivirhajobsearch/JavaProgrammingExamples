package java_15D_collections_programs_deque_interface_26;

//Java Program to demosntrates the 
//working of remove(), remove(Object), 
//removeFirst(), removeLast()
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02E_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		// Create ConcurrentLinkedDeque d
		ConcurrentLinkedDeque<Integer> d = new ConcurrentLinkedDeque<>();

		// Add elements to the deque
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		d.add(80);

		// Display the current deque
		System.out.println("Deque: " + d);

		// Remove the first element
		System.out.println("Removing the first element: " + d.remove());

		// Remove element 60 using remove(Object)
		System.out.println("60 removed?: " + d.remove(60));

		// Display the deque after removals
		System.out.println("Deque after removal: " + d);

		// Remove the first element
		d.removeFirst();

		// Remove the last element
		d.removeLast();

		// Display the deque after removing
		// first and last elements
		System.out.println("Deque after removing first and last element: " + d);
	}
}