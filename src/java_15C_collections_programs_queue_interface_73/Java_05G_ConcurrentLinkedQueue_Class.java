package java_15C_collections_programs_queue_interface_73;

//Java Program Demonstrate the 
//working of element() and peek()
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05G_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) throws IllegalStateException {
		
		// Create an instance of ConcurrentLinkedQueue
		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

		// Add numbers to end of Queue
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		System.out.println("Queue: " + q);

		// print head using element()
		System.out.println("Queue's head: " + q.element());

		// print head using peek()
		System.out.println("Queue's head: " + q.peek());
	}
}