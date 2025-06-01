package java_15C_collections_programs_queue_interface_73;

//Java Program to iterate 
//through the LinkedBlockingDeque
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01G_Blocking_Queue_Interface {

	public static void main(String[] args) {

		// Instantiate an object of LinkedBlockingDeque named lbdq
		BlockingQueue<Integer> lbdq = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		lbdq.add(166);
		lbdq.add(246);
		lbdq.add(66);
		lbdq.add(292);
		lbdq.add(98);

		// Create an iterator to traverse lbdq
		Iterator<Integer> lbdqIter = lbdq.iterator();

		// Print the elements of lbdq on to the console
		System.out.println("The LinkedBlockingDeque, lbdq contains:");

		for (int i = 0; i < lbdq.size(); i++) {
			System.out.print(lbdqIter.next() + " ");
		}
	}

}