package java_15F_collections_programs_sorted_set_interface_22;

//Java Program to demonstrates the working of
//ConcurrentSkipListSet
import java.util.concurrent.ConcurrentSkipListSet;

public class Java_03A_ConcurrentSkipListSet_Class {

	public static void main(String[] args) {

		ConcurrentSkipListSet<Integer> s = new ConcurrentSkipListSet<>();

		// Adding elements
		s.add(10);
		s.add(20);
		s.add(30);

		// Displaying the set
		System.out.println("Set: " + s);
	}
}