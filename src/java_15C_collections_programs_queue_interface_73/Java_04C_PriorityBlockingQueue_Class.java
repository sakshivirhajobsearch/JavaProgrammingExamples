package java_15C_collections_programs_queue_interface_73;

import java.util.Vector;
//Java program to demonstrate
//PriorityBlockingQueue(Collection c) constructor
import java.util.concurrent.PriorityBlockingQueue;

public class Java_04C_PriorityBlockingQueue_Class {

	public static void main(String[] args) {

		// Creating a Collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);

		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue(Collection c)
		// constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(v);

		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}