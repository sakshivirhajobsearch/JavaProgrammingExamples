package java_15E_collections_programs_set_interface_39;

//Java program demonstrating the 
//working of a protected constructor 
//in an abstract class

//Abstract class with a protected constructor
abstract class AbstractSet {

	// Protected constructor, cannot be
	// called directly from outside the class
	protected AbstractSet() {
		System.out.println("AbstractSet constructor called");
	}

	// Abstract method to be implemented by subclasses
	public abstract void display();
}

//Concrete subclass extending AbstractSet
class MySet extends AbstractSet {

	// Constructor for MySet
	public MySet() {

		// Calls the protected constructor of AbstractSet
		super();
		System.out.println("MySet constructor called");
	}

	// Implementation of the abstract display method
	@Override
	public void display() {
		System.out.println("Displaying elements in MySet");
	}
}

public class Java_01B_Abstract_Set_Class {

	public static void main(String[] args) {

		// We cannot instantiate AbstractSet directly
		// because it is an abstract class
		// AbstractSet set = new AbstractSet();
		// This would cause a compile-time error

		// Creating an instance of MySet, which is a subclass of AbstractSet
		MySet set = new MySet();

		// Calling the display method of MySet
		set.display();
	}
}