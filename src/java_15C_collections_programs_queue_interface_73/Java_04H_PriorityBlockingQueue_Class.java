package java_15C_collections_programs_queue_interface_73;

//Java Program Demonstrate accessing
//elements of PriorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04H_PriorityBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of PriorityBlockingQueue
		int c = 5;

		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<Integer> Pbq = new PriorityBlockingQueue<Integer>(c);

		// Add elements to PriorityBlockingQueue
		Pbq.add(10);
		Pbq.add(20);

		// print PrioQueue
		System.out.println("PriorityQueue: " + Pbq);

		// get head of PriorityBlockingQueue
		int h = Pbq.peek();

		// print head of PriorityBlockingQueue
		System.out.println("Head of Queue: " + h);
	}
}