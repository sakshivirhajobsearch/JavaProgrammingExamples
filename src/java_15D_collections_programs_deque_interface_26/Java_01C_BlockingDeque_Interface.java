package java_15D_collections_programs_deque_interface_26;

//Java Program for Adding elements 
//to a LinkedBlockingDeque
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01C_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate a LinkedBlockingDeque named b1
		BlockingDeque<Integer> b1 = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		b1.add(10);
		b1.add(20);
		b1.add(30);
		b1.add(40);
		b1.add(50);

		// Print the contents of b1 on the console
		System.out.println("Contents of b1: " + b1);

		// Instantiate a LinkedBlockingDeque named b2
		LinkedBlockingDeque<Integer> b2 = new LinkedBlockingDeque<Integer>();

		// Add elements from b1 using addAll()
		b2.addAll(b1);

		// Print the contents of b2 on the console
		System.out.println("\nContents of b2: " + b2);
	}
}
