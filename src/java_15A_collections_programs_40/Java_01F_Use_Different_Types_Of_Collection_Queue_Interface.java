package java_15A_collections_programs_40;

//Java program to demonstrate the working of
//priority queue in Java
import java.util.PriorityQueue;

public class Java_01F_Use_Different_Types_Of_Collection_Queue_Interface {

	// Main Method
	public static void main(String args[]) {

		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
	}
}
