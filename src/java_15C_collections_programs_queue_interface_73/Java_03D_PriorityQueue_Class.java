package java_15C_collections_programs_queue_interface_73;

import java.util.PriorityQueue;

public class Java_03D_PriorityQueue_Class {

	public static void main(String args[]) {

		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println(pq);
	}
}