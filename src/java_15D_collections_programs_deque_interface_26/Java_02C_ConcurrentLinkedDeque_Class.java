package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates 
//the working of addFirst(),
//peekLast(), peekFirst(), 
//removeLast(), removeFirst()
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02C_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		// Create a ConcurrentLinkedDeque
		ConcurrentLinkedDeque<Integer> d = new ConcurrentLinkedDeque<>();

		// Add elements to the front
		d.addFirst(10);
		d.addFirst(20);
		d.addFirst(30);
		d.addFirst(40);

		// Display the d
		System.out.println("Deque: " + d);

		// Display the last element using peekLast()
		System.out.println("Last Element: " + d.peekLast());

		// Display the first element using peekFirst()
		System.out.println("First Element: " + d.peekFirst());

		// Remove the last element using removeLast()
		d.removeLast();

		// Display the d after removing the last element
		System.out.println("Deque after removal of last element: " + d);

		// Remove the first element using removeFirst()
		d.removeFirst();

		// Display the d after removing the first element
		System.out.println("Deque after removal of first element: " + d);
	}
}