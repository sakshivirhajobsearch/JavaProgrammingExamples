package java_15C_collections_programs_queue_interface_73;

//Java program to remove elements
//from a Queue

import java.util.PriorityQueue;
import java.util.Queue;

public class Java_001E_Queue_Interface {

	public static void main(String args[]) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial Queue: " + pq);

		pq.remove("Geeks");

		System.out.println("After Remove: " + pq);

		System.out.println("Poll Method: " + pq.poll());

		System.out.println("Final Queue: " + pq);
	}
}
