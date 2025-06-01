package java_15E_collections_programs_set_interface_39;

//Java Program to demosntrates 
//the working of iterator()
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Java_01E_Abstract_Set_Class {

	public static void main(String[] args) {

		// Creating a HashSet, which is a
		// concrete subclass of AbstractSet
		Set<Integer> set = new HashSet<>();

		// Adding elements to the set
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		// Creating an iterator to iterate over the set
		Iterator<Integer> i = set.iterator();

		// Iterating over the elements using the iterator
		System.out.println("Iterating over the set elements:");
		while (i.hasNext()) {

			System.out.print(i.next() + "  ");
		}
	}
}