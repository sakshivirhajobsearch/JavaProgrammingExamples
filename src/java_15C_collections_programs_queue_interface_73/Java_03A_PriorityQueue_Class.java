package java_15C_collections_programs_queue_interface_73;

//Java Program for PriorityQueue
import java.util.PriorityQueue;

public class Java_03A_PriorityQueue_Class {

	public static void main(String[] args) {

		// Priority Queue Min Type
		PriorityQueue<Integer> p = new PriorityQueue<>();

		// Add elements to the queue
		p.add(3);
		p.add(10);
		p.add(7);
		p.add(2);

		// Print the head of the queue
		System.out.println("Head of Queue: " + p.peek());

	}
}