package java_15D_collections_programs_deque_interface_26;

//Java program to demomstrates 
//Removal Elements in Deque
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_03G_ArrayDeque_Class {

	public static void main(String[] args) {

		// Initializing a deque
		Deque<String> d = new ArrayDeque<String>();

		// Adding elements
		d.add("Java");
		d.addFirst("C++");
		d.addLast("Python");

		// Printing initial elements
		System.out.println("Initial Deque: " + d);

		// Removing elements as a stack from top/front
		System.out.println("Removed element using pop(): " + d.pop());

		// Removing an element from the front
		System.out.println("Removed element using poll(): " + d.poll());

		// Removing an element from the front using pollFirst
		System.out.println("Removed element using pollFirst(): " + d.pollFirst());

		// The deque is empty now
		System.out.println("Final Deque: " + d);
	}
}