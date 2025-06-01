package java_15E_collections_programs_set_interface_39;

//Java Program to demonstrates the 
//working of CopyOnWriteArraySet 
import java.util.concurrent.CopyOnWriteArraySet;

public class Java_02A_CopyOnWriteArraySet_Class {

	public static void main(String[] args) {
		
		// Create a CopyOnWriteArraySet
		CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

		// Adding elements to the set
		s.add("Geek1");
		s.add("Geek2");
		s.add("Geek3");

		System.out.println("Set: " + s);

		// Creating a thread that reads from the set
		Thread readerThread = new Thread(() -> {
			for (String item : s) {
				System.out.println("Reading: " + item);
			}
		});

		// Creating a thread that modifies the set
		Thread writerThread = new Thread(() -> {
			s.add("Grapes");
			System.out.println("Added Geeks");
		});

		// Start both threads
		readerThread.start();
		writerThread.start();
	}
}
