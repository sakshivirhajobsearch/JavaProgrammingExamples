package java_15C_collections_programs_queue_interface_73;

import java.util.LinkedList;
import java.util.Queue;

public class Java_02F_AbstractQueue_Class {

	public static void main(String[] args) {

		// Create a new queue
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add("Alice");
		queue.add("Bob");
		queue.add("Charlie");
		queue.add("David");

		// Print the elements in the queue
		System.out.println("Queue: " + queue);

		// Remove the first element from the queue
		String first = queue.remove();
		System.out.println("Removed element: " + first);

		// Print the remaining elements in the queue
		System.out.println("Queue: " + queue);

		// Peek at the first element in the queue
		String peeked = queue.peek();
		System.out.println("Peeked element: " + peeked);

		// Print the remaining elements in the queue
		System.out.println("Queue: " + queue);
	}
}
