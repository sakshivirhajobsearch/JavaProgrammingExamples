package java_15E_collections_programs_set_interface_39;

//Java Program to demostrates 
//the working of remove() and
//removeAll() method
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java_01D_Abstract_Set_Class {

	public static void main(String[] args) {

		// Creating a HashSet, which is a concrete subclass
		// of AbstractSet
		Set<Integer> set = new HashSet<>();

		// Adding elements to the set
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		// Printing the set before removal
		System.out.println("Set before removal(): " + set);

		// Removing a single element using remove()

		// Removes the element 3 from the set
		set.remove(3);
		System.out.println("Set after removal of element 3: " + set);

		// Creating a collection to remove multiple elements
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(5);

		// Removing all elements in the collection using
		// removeAll() Removes all elements that are in l
		set.removeAll(l);
		System.out.println("Set after removeAll() : " + set);
	}
}
