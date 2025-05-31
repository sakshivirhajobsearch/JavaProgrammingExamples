package java_15D_collections_programs_deque_interface_26;

//Java Program to demonstrate
//the working of BlockingDeque
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01B_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate an object
		BlockingDeque<Integer> b = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		b.add(134);
		b.add(245);
		b.add(23);
		b.add(122);
		b.add(90);

		// Create an iterator to traverse the deque
		Iterator<Integer> i = b.iterator();

		System.out.println("The LinkedBlockingDeque contains:");

		for (int j = 0; j < b.size(); j++) {
			System.out.print(i.next() + " ");
		}

		System.out.println();

		// Remove 23 and display appropriate
		// message if the operation is successful
		if (b.remove(23)) {
			System.out.println("\nThe element 23 has been removed");
		} else {
			System.out.println("No such element was found");
		}

		// Print the elements without using iterator
		System.out.println("\nThe LinkedBlockingDeque after remove operation contains:");
		System.out.println(b);
	}
}