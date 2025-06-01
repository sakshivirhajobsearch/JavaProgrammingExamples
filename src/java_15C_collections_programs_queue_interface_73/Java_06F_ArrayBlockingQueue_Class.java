package java_15C_collections_programs_queue_interface_73;

//Iterating elements in an ArrayBlockingQueue
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06F_ArrayBlockingQueue_Class {

	public static void main(String[] args) {
		
		// Define capacity of ArrayBlockingQueue
		int c = 5;

		// Create object of ArrayBlockingQueue
		ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(c);

		// Add elements to ArrayBlockingQueue
		q.offer("Java");
		q.offer("C++");
		q.offer("Python");
		q.offer("Js");

		// Print ArrayBlockingQueue
		System.out.println("ArrayBlockingQueue is: " + q);

		// Call iterator() method and Create an iterator
		Iterator i = q.iterator();

		// Print elements of iterator
		System.out.println("The iterator values:");
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}
