package java_15A_collections_programs_40;

import java.util.ArrayList;

public class Java_10A_Replace_Elements_In_A_List {

	public static void main(String[] args) {

		try {

			// Creating an object of Arraylist class
			ArrayList<String> a = new ArrayList<>();

			a.add("A");
			a.add("B");
			a.add("C");
			a.add("D");

			// 2 is the index of the element "C".
			// "C" will be replaced by "E"
			a.set(2, "E");

			System.out.println(a);

		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Display the exception on the console
			System.out.println(e);
		}
	}
}
