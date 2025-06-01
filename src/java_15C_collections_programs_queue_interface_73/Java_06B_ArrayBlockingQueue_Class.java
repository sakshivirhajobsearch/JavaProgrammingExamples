package java_15C_collections_programs_queue_interface_73;

//Java program to demonstrate the working of
//ArrayBlockingQueue(int initialCapacity)
//constructor
import java.util.concurrent.ArrayBlockingQueue;

public class Java_06B_ArrayBlockingQueue_Class {

	public static void main(String[] args) {
		
		// define capacity of ArrayBlockingQueue
		int c = 15;

		// create object of ArrayBlockingQueue
		// using ArrayBlockingQueue(int initialCapacity) constructor
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<Integer>(c);

		// add numbers
		a.add(1);
		a.add(2);
		a.add(3);

		// print queue
		System.out.println("ArrayBlockingQueue:" + a);
	}
}