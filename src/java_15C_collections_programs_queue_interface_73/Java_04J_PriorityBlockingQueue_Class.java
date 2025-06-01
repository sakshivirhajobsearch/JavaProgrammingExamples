package java_15C_collections_programs_queue_interface_73;

import java.util.Comparator;
//Java Program Demonstrate comparator()
//method and passing Comparator to PriorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04J_PriorityBlockingQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(10, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		});

		// Add numbers to PriorityBlockingQueue
		pbq.put(45815616);
		pbq.put(4981561);
		pbq.put(4594591);
		pbq.put(9459156);

		// get String representation of
		// PriorityBlockingQueue
		String str = pbq.toString();

		// Creating a comparator using comparator()
		Comparator c = pbq.comparator();

		// Displaying the comparator values
		System.out.println("Comparator value: " + c);

		if (c == null)
			System.out.println("PriorityBlockingQueue follows natural ordering");
		else
			System.out.println("PriorityBlockingQueue follows : " + c);
	}
}
