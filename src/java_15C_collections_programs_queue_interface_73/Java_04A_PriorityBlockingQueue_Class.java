package java_15C_collections_programs_queue_interface_73;

//Adding elements to priorityBlockingQueue
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04A_PriorityBlockingQueue_Class {

	public static void main(String[] args) {

		// Create a PriorityBlockingQueue
		PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<>();

		// Add elements to the q
		q.add(10);
		q.add(5);
		q.add(20);
		q.add(1);

		System.out.println("PriorityBlockingQueue: " + q);
	}
}
