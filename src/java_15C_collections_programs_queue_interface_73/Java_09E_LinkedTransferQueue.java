package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate adding
//elements to LinkedTransferQueue
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class Java_09E_LinkedTransferQueue {

	public static void main(String[] args) {

		// Initializing the queue
		LinkedTransferQueue<Integer> q = new LinkedTransferQueue<Integer>();

		// Adding elements to this queue
		for (int i = 10; i <= 14; i++)
			q.add(i);

		// Add the element using offer() method
		System.out.println("adding 15 " + q.offer(15, 5, TimeUnit.SECONDS));

		// Adding elements to this queue
		for (int i = 16; i <= 20; i++)
			q.put(i);

		// Printing the elements of the queue
		System.out.println("The elements in the queue are:");
		for (Integer i : q)
			System.out.print(i + " ");

		System.out.println();

		// create another queue to demonstrate transfer
		// method
		LinkedTransferQueue<String> g = new LinkedTransferQueue<String>();

		new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("Transferring" + " an element");

					// Transfer a String element
					// using transfer() method
					g.transfer("is a computer" + " science portal.");
					System.out.println("Element " + "transfer is complete");
				} catch (InterruptedException e1) {
					System.out.println(e1);
				} catch (NullPointerException e2) {
					System.out.println(e2);
				}
			}
		}).start();

		try {

			// Get the transferred element
			System.out.println("Geeks for Geeks " + g.take());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}