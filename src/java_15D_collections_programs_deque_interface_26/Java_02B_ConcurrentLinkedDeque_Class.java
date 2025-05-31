package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrates 
//the working of addFirst()
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02B_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		// Create a ConcurrentLinkedDeque
		ConcurrentLinkedDeque<Integer> d = new ConcurrentLinkedDeque<>();

		// Add elements to the front
		d.addFirst(10);
		d.addFirst(20);
		d.addFirst(30);
		d.addFirst(40);

		// Display the deque
		System.out.println("Deque: " + d);

		// Create another ConcurrentLinkedDeque
		// by copying the first one
		ConcurrentLinkedDeque<Integer> d1 = new ConcurrentLinkedDeque<>(d);

		System.out.println("Deque Copy: " + d1);
	}
}
