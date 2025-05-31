package java_15D_collections_programs_deque_interface_26;

//Java Program to demosntrates 
//the working of remove()
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01E_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate an object of LinkedBlockingDeque named b
		BlockingDeque<Integer> b = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		b.add(75);
		b.add(86);
		b.add(13);
		b.add(44);
		b.add(10);

		System.out.println("The LinkedBlockingDeque, b contains:");
		System.out.println(b);

		// Remove elements using remove()
		b.remove(86);
		b.remove(44);
		System.out.println();

		// Trying to remove an element
		// that doesn't exist in the LinkedBlockingDeque
		boolean r = b.remove(Integer.valueOf(1));

		if (!r) {
			System.out.println("Element 1 not found in the deque.");
		}

		System.out.println("\nAfter removal the LinkedBlockingDeque, b contains:");
		System.out.println(b);

	}
}