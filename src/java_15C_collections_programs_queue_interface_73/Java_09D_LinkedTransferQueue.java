package java_15C_collections_programs_queue_interface_73;

//Java Program to demosntrate the 
//working of add(), poll() and size() method
import java.util.concurrent.LinkedTransferQueue;

public class Java_09D_LinkedTransferQueue {

	public static void main(String[] args) throws InterruptedException {

		// create object of LinkedTransferQueue
		LinkedTransferQueue<Integer> l = new LinkedTransferQueue<Integer>();

		// Add numbers to end of LinkedTransferQueue
		// using add() method
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		// prints the Queue
		System.out.println("LinkedTransferQueue: " + l);

		// prints the size of Queue after removal
		// using size() method
		System.out.println("Size of LinkedTransferQueue: " + l.size());

		// removes the front element and prints it
		// using poll() method
		System.out.println("First element: " + l.poll());

		// prints the Queue
		System.out.println("Linked Transfer Queue: " + l);

		System.out.println("Size of LinkedTransferQueue: " + l.size());
	}
}