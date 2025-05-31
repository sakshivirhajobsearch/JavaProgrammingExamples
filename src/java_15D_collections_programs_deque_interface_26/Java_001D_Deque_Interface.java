package java_15D_collections_programs_deque_interface_26;

//Java program to demonstrate the
//removal of elements in deque
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_001D_Deque_Interface {

	public static void main(String[] args) {

		// Initializing an deque
		Deque<String> dq = new ArrayDeque<String>();

		// add() method to insert
		dq.add("For");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");

		System.out.println(dq);

		System.out.println(dq.pop());

		System.out.println(dq.poll());

		System.out.println(dq.pollFirst());

		System.out.println(dq.pollLast());
	}
}
