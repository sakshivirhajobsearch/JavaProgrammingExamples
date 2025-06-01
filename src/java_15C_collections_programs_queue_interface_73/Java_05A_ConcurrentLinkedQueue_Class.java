package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate the working of
//ConcurrentLinkedQueue
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05A_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {

		// Create a ConcurrentLinkedQueue
		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

		// Adding elements to the queue
		q.offer(1);
		q.offer(2);
		q.offer(3);

		System.out.println("Queue after adding elements: " + q);
	}
}