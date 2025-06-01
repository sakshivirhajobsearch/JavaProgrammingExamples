package java_15C_collections_programs_queue_interface_73;

//Java program to iterate elements
//to a Queue

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Java_001F_Queue_Interface {

	public static void main(String args[]) {

		Queue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
