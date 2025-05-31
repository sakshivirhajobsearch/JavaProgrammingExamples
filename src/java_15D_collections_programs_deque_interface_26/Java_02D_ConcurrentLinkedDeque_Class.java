package java_15D_collections_programs_deque_interface_26;

//Add Elements in ConcurrentLinkedDeque
import java.util.concurrent.ConcurrentLinkedDeque;

public class Java_02D_ConcurrentLinkedDeque_Class {

	public static void main(String[] args) {

		// Create ConcurrentLinkedDeque d
		ConcurrentLinkedDeque<Integer> d = new ConcurrentLinkedDeque<>();

		// Add elements to the tail
		d.add(10);
		d.add(20);

		// Add element to the head
		d.addFirst(30);

		// Display the elements in d
		System.out.println("Elements in d: " + d);

		// Create another ConcurrentLinkedDeque d1
		ConcurrentLinkedDeque<Integer> d1 = new ConcurrentLinkedDeque<>();

		// Add all elements from d to d1
		d1.addAll(d);

		// Display the elements in cld2
		System.out.println("Elements in d1: " + d1);
	}
}