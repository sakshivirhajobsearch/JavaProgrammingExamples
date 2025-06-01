package java_15C_collections_programs_queue_interface_73;

//Java Program Demonstrate the 
//working of iterator() method
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05F_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {
		
		// Create an instance of ConcurrentLinkedQueue
		ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();

		// Add String to queue using add(e) method
		q.add("Java");
		q.add("C++");
		q.add("Python");
		q.add("js");

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + q);

		// Call iterator() method
		Iterator i = q.iterator();

		// Print elements of iterator
		System.out.println("The String Values of iterator are:");
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}