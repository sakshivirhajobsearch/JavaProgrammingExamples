package java_15C_collections_programs_queue_interface_73;

import java.util.Iterator;
//Java Program Demonstrate iterating
//over LinkedBlockingQueue
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08G_LinkedBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of LinkedBlockingQueue
		int c = 7;

		// create object of LinkedBlockingQueue
		LinkedBlockingQueue<String> l = new LinkedBlockingQueue<String>(c);

		// Add element to LinkedBlockingQueue
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");

		// create Iterator of linkedQueue using iterator() method
		Iterator<String> i = l.iterator();

		// print result
		System.out.println("Elements in the LinkedBlockingQueue: ");
		while (i.hasNext())
			System.out.print(i.next() + " ");
	}
}