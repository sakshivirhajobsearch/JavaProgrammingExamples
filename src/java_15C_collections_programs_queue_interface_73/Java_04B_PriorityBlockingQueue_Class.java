package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate
//PriorityBlockingQueue() constructor
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04B_PriorityBlockingQueue_Class {

	public static void main(String[] args) {
		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue() constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		pbq.add(5);

		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}