package java_15C_collections_programs_queue_interface_73;

//Java Program Demonstrate accessing
//elements of LinkedBlockingQueue
import java.util.concurrent.LinkedBlockingQueue;

public class Java_09A_LinkedTransferQueue {

	public static void main(String[] args) {

		// define capacity of LinkedBlockingQueue
		int c = 7;

		// create object of LinkedBlockingQueue
		LinkedBlockingQueue<String> l = new LinkedBlockingQueue<String>(c);

		// Add element to LinkedBlockingQueue
		l.add("Java");
		l.add("C++");
		l.add("Python");
		l.add("Js");

		// find head of linkedQueue using peek() method
		String s = l.peek();

		// print result
		System.out.println("LinkedBlockingQueue: " + l);

		// print head of queue
		System.out.println("Head of LinkedBlockingQueue is: " + s);

		// removing one element
		l.remove();

		// again get head of queue
		s = l.peek();

		// print result
		System.out.println("Removing one element from Queue");
		System.out.println("Updated LinkedBlockingQueue is: " + l);

		// print head of queue
		System.out.println("Updated Head of LinkedBlockingQueue is: " + s);
	}
}