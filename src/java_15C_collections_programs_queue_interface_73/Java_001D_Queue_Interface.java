package java_15C_collections_programs_queue_interface_73;

//Java program to add elements to a Queue

import java.util.PriorityQueue;
import java.util.Queue;

public class Java_001D_Queue_Interface {

	public static void main(String args[]) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println(pq);
	}
}
