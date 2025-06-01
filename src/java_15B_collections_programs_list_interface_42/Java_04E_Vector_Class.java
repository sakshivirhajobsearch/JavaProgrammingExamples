package java_15B_collections_programs_list_interface_42;

//Java program illustrating the removal
//of elements from vector
import java.util.Vector;

public class Java_04E_Vector_Class {

	public static void main(String[] arg) {

		// Create default vector of capacity 10
		Vector v = new Vector();

		// Add elements using add() method
		v.add(1);
		v.add(2);
		v.add("Geeks");
		v.add("forGeeks");
		v.add(4);

		// Removing first occurrence element at 1
		v.remove(1);

		System.out.println("After removal: " + v);
	}
}
