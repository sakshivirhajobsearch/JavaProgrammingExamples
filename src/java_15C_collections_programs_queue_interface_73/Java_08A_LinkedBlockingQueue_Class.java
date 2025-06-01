package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate 
//how LinkedBlockingQueue works
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08A_LinkedBlockingQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// Create a LinkedBlockingQueue
		// with a capacity of 3
		LinkedBlockingQueue<String> q = new LinkedBlockingQueue<>(3);

		// Insert elements into the queue
		q.put("Geek 1");
		q.put("Geek 2");
		q.put("Geek 3");

		// Print the elements of the queue
		System.out.println("LinkedBlockingQueue is: ");
		for (String i : q) {
			System.out.println(i);
		}
	}
}
