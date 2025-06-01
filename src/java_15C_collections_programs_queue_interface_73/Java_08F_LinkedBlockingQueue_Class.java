package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate removing
//elements from the LinkedBlockingQueue
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08F_LinkedBlockingQueue_Class {

	public static void main(String[] args) {

		// define capacity of LinkedBlockingQueue
		int c = 15;

		// create object of LinkedBlockingQueue
		LinkedBlockingQueue<Integer> l = new LinkedBlockingQueue<Integer>(c);

		// add numbers
		l.add(1);
		l.add(2);
		l.add(3);

		// print queue
		System.out.println("LinkedBlockingQueue:" + l);

		// remove element 2
		l.remove(2);

		// print queue
		System.out.println("Updated LinkedBlockingQueue:" + l);
	}
}
