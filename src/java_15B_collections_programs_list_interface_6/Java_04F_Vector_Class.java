package java_15B_collections_programs_list_interface_6;

//Java program to iterate the elements
//in a Vector
import java.util.Vector;

public class Java_04F_Vector_Class {

	public static void main(String args[]) {
		
		// create an instance of vector
		Vector<String> v = new Vector<>();

		// Add elements using add() method
		v.add("Geeks");
		v.add("Geeks");
		v.add(1, "For");

		// Using the Get method and the
		// for loop
		for (int i = 0; i < v.size(); i++) {

			System.out.print(v.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : v)
			System.out.print(str + " ");
	}
}
