package java_15C_collections_programs_queue_interface_73;

//Java Program to add elements in a PriorityQueue
import java.util.PriorityQueue;

public class Java_03C_PriorityQueue_Class {

	public static void main(String args[]) {

		// Creating PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < 3; i++) {
			pq.add(i);
			pq.add(1);
		}

		System.out.println(pq);
	}
}