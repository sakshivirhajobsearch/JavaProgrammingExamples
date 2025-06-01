package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate
//PriorityBlockingQueue(int initialCapacity)
//constructor
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04D_PriorityBlockingQueue_Class {

	public static void main(String[] args) {
		
		// define capacity of PriorityBlockingQueue
		int c = 15;

		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue(int initialCapacity)
		// constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(c);

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);

		// print queue
		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}