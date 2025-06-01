package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate adding elements
//to the PriorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04F_PriorityBlockingQueue_Class {

	public static void main(String[] args) {
		
		// define capacity of PriorityBlockingQueue
		int c = 15;

		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(c);

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);

		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}
