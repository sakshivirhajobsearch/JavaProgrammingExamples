package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrates how 
//to copy elements to another LinkedTransferQueue
import java.util.concurrent.LinkedTransferQueue;

public class Java_09C_LinkedTransferQueue {

	public static void main(String[] args) {

		// Create object of LinkedTransferQueue
		LinkedTransferQueue<Integer> l = new LinkedTransferQueue<Integer>();

		// Add numbers to the LinkedTransferQueue
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		// Print Queue 1
		System.out.println("LinkedTransferQueue1: " + l);

		// Create a new LinkedTransferQueue
		// with the elements from the first queue
		LinkedTransferQueue<Integer> l2 = new LinkedTransferQueue<Integer>(l);

		// Print Queue 2
		System.out.println("LinkedTransferQueue2: " + l2);
	}
}
