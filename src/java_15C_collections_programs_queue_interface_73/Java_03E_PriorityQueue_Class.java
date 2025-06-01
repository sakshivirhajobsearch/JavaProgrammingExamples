package java_15C_collections_programs_queue_interface_73;

//Java program to remove elements
//from a PriorityQueue
import java.util.PriorityQueue;

public class Java_03E_PriorityQueue_Class {

	public static void main(String args[]) {

		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial PriorityQueue " + pq);

		// using the method
		pq.remove("Geeks");

		System.out.println("After Remove: " + pq);

		System.out.println("Poll Method: " + pq.poll());

		System.out.println("Final PriorityQueue: " + pq);
	}
}
