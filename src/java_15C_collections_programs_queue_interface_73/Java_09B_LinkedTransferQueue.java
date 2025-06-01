package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate the 
//working of LinkedTransferQueue
import java.util.concurrent.LinkedTransferQueue;

public class Java_09B_LinkedTransferQueue {

	public static void main(String[] args) {

		// Create a LinkedTransferQueue
		LinkedTransferQueue<String> q = new LinkedTransferQueue<>();

		// Add some elements to the queue
		q.add("1");
		q.add("2");
		q.add("3");

		// Print the elements of the queue
		System.out.println("LinkedTransferQueue is: ");
		while (!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
	}
}