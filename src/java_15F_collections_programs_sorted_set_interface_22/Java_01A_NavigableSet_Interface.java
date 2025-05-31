package java_15F_collections_programs_sorted_set_interface_22;

//Java program to demonstrates 
//the working of NavigableSet 
import java.util.NavigableSet;
import java.util.TreeSet;

public class Java_01A_NavigableSet_Interface {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<>();

		// Add elements to the set
		ns.add(10);
		ns.add(20);
		ns.add(30);
		ns.add(40);
		ns.add(50);

		System.out.println("Navigable Set: " + ns);
	}
}
