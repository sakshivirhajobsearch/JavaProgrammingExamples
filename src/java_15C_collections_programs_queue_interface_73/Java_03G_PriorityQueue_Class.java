package java_15C_collections_programs_queue_interface_73;

//Java program to iterate elements
//to a PriorityQueue
import java.util.Iterator;
import java.util.PriorityQueue;

public class Java_03G_PriorityQueue_Class {

	// Main Method
	public static void main(String args[]) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		Iterator iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
