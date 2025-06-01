package java_15C_collections_programs_queue_interface_73;

//Java Program demonstrating both with individual elements
//and by copying another queue using a constructor
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05B_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {
		
		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue() constructor
		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<Integer>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + q);

		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue(Collection c)
		// constructor
		ConcurrentLinkedQueue<Integer> q1 = new ConcurrentLinkedQueue<Integer>(q);

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue1: " + q1);
	}
}
