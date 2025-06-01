package java_15E_collections_programs_set_interface_39;

//Java Program to Illustrate AbstractSet Class
import java.util.LinkedHashSet;

//Concrete subclass of AbstractSet
public class Java_01C_Abstract_Set_Class {

	public static void main(String[] args) {

		// Creating a LinkedHashSet to
		// maintain insertion order
		AbstractSet<Integer> set = new LinkedHashSet<>();

		// Adding elements to the AbstractSet
		// (through LinkedHashSet)
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println("AbstractSet elements: " + set);
	}
}
