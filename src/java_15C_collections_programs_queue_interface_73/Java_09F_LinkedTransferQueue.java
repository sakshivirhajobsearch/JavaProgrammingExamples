package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate removing
//elements of LinkedTransferQueue
import java.util.concurrent.LinkedTransferQueue;

public class Java_09F_LinkedTransferQueue {

	public static void main(String[] args) {

		// Initializing the q
		LinkedTransferQueue<Integer> q = new LinkedTransferQueue<Integer>();

		// Adding elements to this q
		for (int i = 1; i <= 5; i++)
			q.add(i);

		// Printing the elements of the q
		System.out.println("The elements in the Queue are:");
		for (Integer i : q)
			System.out.print(i + " ");

		// remove() method will remove the specified
		// element from the q
		q.remove(1);
		q.remove(5);

		// Printing the elements of the q
		System.out.println("\nRemaining elements in Queue are : ");
		for (Integer i : q)
			System.out.print(i + " ");
	}
}
