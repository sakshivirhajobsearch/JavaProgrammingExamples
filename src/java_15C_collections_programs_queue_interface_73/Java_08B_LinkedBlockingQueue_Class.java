package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate 
//LinkedBlockingQueue() constructor 
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08B_LinkedBlockingQueue_Class {

	public static void main(String[] args) {

		// create object of LinkedBlockingQueue
		// using LinkedBlockingQueue() constructor
		LinkedBlockingQueue<Integer> l = new LinkedBlockingQueue<Integer>();

		// add numbers
		l.add(1);
		l.add(2);
		l.add(3);

		System.out.println("LinkedBlockingQueue:" + l);
	}
}
