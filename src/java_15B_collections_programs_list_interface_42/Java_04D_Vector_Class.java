package java_15B_collections_programs_list_interface_42;

//Java program to change the
//elements in vector class
import java.util.Vector;

//Driver Class
public class Java_04D_Vector_Class {

	public static void main(String args[]) {

		// Creating an empty Vector
		Vector<Integer> v = new Vector<Integer>();

		// Use add() method to add
		// elements in the vector
		v.add(12);
		v.add(23);
		v.add(22);
		v.add(10);
		v.add(20);

		// Displaying the Vector
		System.out.println("Vector: " + v);

		// Using set() method to replace 12 with 21
		System.out.println("The Object that is replaced is: " + v.set(0, 21));

		// Using set() method to replace 20 with 50
		System.out.println("The Object that is replaced is: " + v.set(4, 50));

		// Displaying the modified vector
		System.out.println("The new Vector is:" + v);
	}
}
