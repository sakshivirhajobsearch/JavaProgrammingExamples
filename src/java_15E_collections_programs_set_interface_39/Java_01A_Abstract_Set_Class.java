package java_15E_collections_programs_set_interface_39;

//Java Program to demonstrates the 
//working of AbstractSet class
import java.util.HashSet;
import java.util.Set;

abstract class AbstractSet {

	// Abstract method to insert an element
	public abstract void insert(int element);

	// Abstract method to display the elements
	public abstract void display();
}

class MySet extends AbstractSet {

	// Set to hold the elements
	private Set<Integer> elements;

	// Constructor
	public MySet() {
		elements = new HashSet<>();
	}

	// Implement the insert method
	public void insert(int element) {
		elements.add(element);
	}

	// Implement the display method
	public void display() {
		for (Integer element : elements) {
			System.out.println(element);
		}
	}
}

public class Java_01A_Abstract_Set_Class {

	public static void main(String[] args) {

		MySet s = new MySet();

		// Insert elements
		s.insert(10);
		s.insert(20);
		s.insert(30);

		// Display elements
		System.out.println("Elements in the set:");
		s.display();
	}
}
