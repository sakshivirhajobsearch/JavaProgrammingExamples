package java_15D_collections_programs_deque_interface_26;

//Java program to dmeonstrates 
//the working of BlockingDeque
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_01A_BlockingDeque_Interface {

	public static void main(String[] args) {

		// Instantiate a BlockingDeque
		BlockingDeque<Integer> d = new LinkedBlockingDeque<>();

		// Insert elements into the deque
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);

		System.out.println("The elements in the BlockingDeque:");
		System.out.println(d);
	}
}