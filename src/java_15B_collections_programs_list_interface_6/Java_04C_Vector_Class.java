package java_15B_collections_programs_list_interface_6;

import java.util.Vector;

//Main class
//AddElementsToVector
class Java_04C_Vector_Class {

	// Main driver method
	public static void main(String[] arg) {
		
		// Case 1
		// Creating a default vector
		Vector v1 = new Vector();

		// Adding custom elements
		// using add() method
		v1.add(1);
		v1.add(2);
		v1.add("geeks");
		v1.add("forGeeks");
		v1.add(3);

		// Printing the vector elements to the console
		System.out.println("Vector v1 is " + v1);

		// Case 2
		// Creating generic vector
		Vector<Integer> v2 = new Vector<Integer>();

		// Adding custom elements
		// using add() method
		v2.add(1);
		v2.add(2);
		v2.add(3);

		// Printing the vector elements to the console
		System.out.println("Vector v2 is " + v2);
	}
}
