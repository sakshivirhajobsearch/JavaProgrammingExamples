package java_15D_collections_programs_deque_interface_26;

//Java program to demonstrate the
//iteration of elements in deque
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Java_001E_Deque_Interface {

	public static void main(String[] args) {

		// Initializing an deque
		Deque<String> dq = new ArrayDeque<String>();

		// add() method to insert
		dq.add("For");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");
		dq.add("is so good");

		for (Iterator itr = dq.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
	}
}