package java_15D_collections_programs_deque_interface_26;

//Java Program to iterate 
//through the LinkedBlockingDeque
import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01F_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate an object of LinkedBlockingDeque named b
		BlockingDeque<Integer> b = new LinkedBlockingDeque<Integer>();

		// Add elements using add()
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);

		// Create an iterator to traverse b
		Iterator<Integer> i = b.iterator();

		// Print the elements of b on to the console
		System.out.println("The LinkedBlockingDeque contains:");

		for (int j = 0; j < b.size(); j++) {
			System.out.print(i.next() + " ");
		}
	}
}