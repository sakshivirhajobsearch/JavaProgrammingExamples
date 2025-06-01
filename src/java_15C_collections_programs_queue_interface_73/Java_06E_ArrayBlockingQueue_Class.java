package java_15C_collections_programs_queue_interface_73;

//Accessing elements in an ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06E_ArrayBlockingQueue_Class {

	public static void main(String[] args) {
		
		// Define capacity of ArrayBlockingQueue
		int c = 5;

		// Create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(c);

		// Add element to ArrayBlockingQueue
		q.add(23);
		q.add(32);
		q.add(45);
		q.add(12);

		// Print queue
		System.out.println("ArrayBlockingQueue is: " + q);

		// Print head of queue using peek() method
		System.out.println("Head of queue is: " + q.peek());
	}
}