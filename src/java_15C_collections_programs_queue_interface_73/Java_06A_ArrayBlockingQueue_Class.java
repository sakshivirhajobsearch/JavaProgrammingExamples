package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrates 
//the working of ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06A_ArrayBlockingQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// Create an ArrayBlockingQueue
		// with a capacity of 3
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);

		// Adding elements to the queue
		q.put(1);
		q.put(2);
		q.put(3);

		// Print the queue after adding elements
		System.out.println("Queue after adding elements: " + q);
	}
}