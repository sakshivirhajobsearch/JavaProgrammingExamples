package java_15C_collections_programs_queue_interface_73;

import java.util.Comparator;
//Java program to demonstrate
//PriorityBlockingQueue(int initialCapacity, Comparator
//comparator) constructor
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04E_PriorityBlockingQueue_Class {

	public static void main(String[] args) {
		
		// define capacity of PriorityBlockingQueue
		int c = 15;

		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(c, Comparator.reverseOrder());

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);

		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}