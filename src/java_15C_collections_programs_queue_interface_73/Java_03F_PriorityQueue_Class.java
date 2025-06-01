package java_15C_collections_programs_queue_interface_73;

//Java program to access elements
//from a PriorityQueue
import java.util.PriorityQueue;

public class Java_03F_PriorityQueue_Class {

	// Main Method
	public static void main(String[] args) {

		// Creating a priority queue
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");
		System.out.println("PriorityQueue: " + pq);

		// Using the peek() method
		String element = pq.peek();
		System.out.println("Accessed Element: " + element);
	}
}
