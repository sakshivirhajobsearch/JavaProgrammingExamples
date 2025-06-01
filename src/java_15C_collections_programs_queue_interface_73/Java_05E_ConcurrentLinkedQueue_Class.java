package java_15C_collections_programs_queue_interface_73;

//Java Program to Demonstrate the 
//working of remove() method
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05E_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {
		
		// Create an instance of ConcurrentLinkedQueue
		ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<Integer>();

		// Add Numbers to queue using add(e) method
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		System.out.println("ConcurrentLinkedQueue: " + q);

		// apply remove() for Number 78249
		boolean b = q.remove(20);

		System.out.println("number 20 remove successfully? : " + b);

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("Updated ConcurrentLinkedQueue: " + q);
	}
}