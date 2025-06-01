package java_15C_collections_programs_queue_interface_73;

//Java Program to demosntrates the 
//working of peek(), poll(), size()
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05C_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {
		
		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue()
		// constructor
		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<Integer>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		System.out.println("ConcurrentLinkedQueue: " + q);

		// Displaying the first element
		// using peek() method
		System.out.println("First Element is: " + q.peek());

		// Remove and display the first element
		// using poll() method
		System.out.println("Head Element is: " + q.poll());

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + q);

		// Get the size using size() method
		System.out.println("Size: " + q.size());
	}
}