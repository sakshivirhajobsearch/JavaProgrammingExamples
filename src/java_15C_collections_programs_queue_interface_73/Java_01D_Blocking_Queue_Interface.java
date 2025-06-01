package java_15C_collections_programs_queue_interface_73;

import java.util.concurrent.BlockingQueue;

//Java Program Demonstrate add()
//method of BlockingQueue

import java.util.concurrent.LinkedBlockingDeque;

public class Java_01D_Blocking_Queue_Interface {

	public static void main(String[] args) throws IllegalStateException {

		// create object of BlockingQueue
		BlockingQueue<Integer> BQ = new LinkedBlockingDeque<Integer>();

		// Add numbers to the BlockingQueue
		BQ.add(7855642);
		BQ.add(35658786);
		BQ.add(5278367);
		BQ.add(74381793);

		// before removing print BlockingQueue
		System.out.println("Blocking Queue: " + BQ);
	}
}