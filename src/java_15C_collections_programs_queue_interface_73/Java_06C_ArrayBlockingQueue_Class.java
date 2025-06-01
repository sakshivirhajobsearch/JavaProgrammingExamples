package java_15C_collections_programs_queue_interface_73;

//Adding elements to an ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06C_ArrayBlockingQueue_Class {

	public static void main(String[] args) {
		
		// define capacity of ArrayBlockingQueue
		int c = 15;

		// create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(c);

		// add numbers
		a.add(100);
		a.add(200);
		a.add(300);

		// print queue
		System.out.println("ArrayBlockingQueue : " + a);
	}
}