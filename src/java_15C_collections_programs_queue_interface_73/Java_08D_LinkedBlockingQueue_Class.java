package java_15C_collections_programs_queue_interface_73;

import java.util.Vector;
//Java program to demonstrate
//LinkedBlockingQueue(Collection c) constructor
import java.util.concurrent.LinkedBlockingQueue;

public class Java_08D_LinkedBlockingQueue_Class {

	public static void main(String[] args) {

		// Creating a Collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);

		// create object of LinkedBlockingQueue
		// using LinkedBlockingQueue(Collection c)
		// constructor
		LinkedBlockingQueue<Integer> l = new LinkedBlockingQueue<Integer>(v);

		// print queue
		System.out.println("LinkedBlockingQueue:" + l);
	}
}