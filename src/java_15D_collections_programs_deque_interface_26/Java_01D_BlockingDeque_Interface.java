package java_15D_collections_programs_deque_interface_26;

//Java Program for Accessing the 
//elements of a LinkedBlockingDeque
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01D_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate an object of
		// LinkedBlockingDeque named b
		BlockingDeque<Integer> b = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		b.add(22);
		b.add(125);
		b.add(723);
		b.add(172);
		b.add(100);

		// Print the elements of b on the console
		System.out.println("The LinkedBlockingDeque, b contains:");
		System.out.println(b);

		// To check if the deque contains 22
		if (b.contains(22))
			System.out.println("The LinkedBlockingDeque, b contains 22");
		else
			System.out.println("No such element exists");

		// Using element() to retrieve the head of the deque
		int head = b.element();
		System.out.println("The head of b: " + head);

		// Using peekLast() to retrieve the tail of the deque
		int tail = b.peekLast();
		System.out.println("The tail of b: " + tail);

	}
}