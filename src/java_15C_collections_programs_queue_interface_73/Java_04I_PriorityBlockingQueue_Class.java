package java_15C_collections_programs_queue_interface_73;

import java.util.Iterator;
//Java Program Demonstrate iterating
//over PriorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04I_PriorityBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of PriorityBlockingQueue
		int c = 5;

		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<String> pbq = new PriorityBlockingQueue<String>(c);

		// Adding elements
		pbq.add("Java");
		pbq.add("C++");
		pbq.add("Python");
		pbq.add("Js");

		// Call iterator() method of PriorityBlockingQueue
		Iterator i = pbq.iterator();

		// Print elements of iterator
		// created from PriorityBlockingQueue
		System.out.println("Elements in PriorityBlockingQueue are:");

		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}
