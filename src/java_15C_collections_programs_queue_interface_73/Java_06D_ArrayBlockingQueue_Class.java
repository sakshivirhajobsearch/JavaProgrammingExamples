package java_15C_collections_programs_queue_interface_73;

//Remove elements from an ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06D_ArrayBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of ArrayBlockingQueue
		int c = 15;

		// create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(c);

		// add numbers
		a.add(1);
		a.add(2);
		a.add(3);

		// print queue
		System.out.println("ArrayBlockingQueue: " + a);

		// remove 223
		boolean b = a.remove(2);

		// print Queue
		System.out.println("Element 2 removed ?: " + b);

		// print Queue
		System.out.println("Updated ArrayBlockingQueue: " + a);

	}
}