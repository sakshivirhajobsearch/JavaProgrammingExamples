package java_15E_collections_programs_set_interface_39;

// Java Program to demonstrates the working of
// CopyOnWriteArraySet Class
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class Java_02B_CopyOnWriteArraySet_Class extends Thread {

	static CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

	public void run() {

		// Child thread trying to add
		// new element in the Set object
		s.add("D");
	}

	public static void main(String[] args) {

		// Adding elements using add() method
		s.add("A");
		s.add("B");
		s.add("C");

		// We create a child thread that
		// is going to modify CopyOnWriteArraySet s
		Java_02B_CopyOnWriteArraySet_Class t = new Java_02B_CopyOnWriteArraySet_Class();

		// Running the child thread
		// using start() method
		t.start();

		// Try block to check for exceptions
		try {
			// Waiting for the thread to add the element

			// Join ensures that main thread waits for the
			// child thread to finish
			t.join();
		}

		// Catch block to handle exceptions
		catch (InterruptedException e) {
			System.out.println("Child thread interrupted.");
		}

		System.out.println("Set after child thread modification: " + s);

		// Now we iterate through the CopyOnWriteArraySet
		// and we won't get any exception.
		Iterator<String> itr = s.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(s);

			if (str.equals("C")) {
				// You cannot remove an element directly
				// using the iterator's remove() So instead
				// we can use remove() method of
				// CopyOnWriteArraySet

				// Removing element C
				s.remove(str);
			}
		}

		System.out.println("Final Set: " + s);
	}
}