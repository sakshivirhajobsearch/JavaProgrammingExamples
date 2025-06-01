package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate
//LinkedBlockingQueue(int initialCapacity) constructor
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08C_LinkedBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of LinkedBlockingQueue
		int c = 15;

		// create object of LinkedBlockingQueue
		// using LinkedBlockingQueue(int initialCapacity)
		// constructor
		LinkedBlockingQueue<Integer> l = new LinkedBlockingQueue<Integer>(c);

		// add numbers
		l.add(1);
		l.add(2);
		l.add(3);

		// print queue
		System.out.println("LinkedBlockingQueue:" + l);
	}
}
