package java_15C_collections_programs_queue_interface_73;

//Java Program to BlockingQueue

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Java_01A_Blocking_Queue_Interface {

	public static void main(String[] args) {

		// Create a BlockingQueue with a capacity of 3
		BlockingQueue<Integer> a = new LinkedBlockingQueue<>(3);

		try {
			// Add elements
			a.put(1);
			a.put(2);
			a.put(3);

			// Printing the BlockingQueue
			System.out.println("BlockingQueue : " + a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}