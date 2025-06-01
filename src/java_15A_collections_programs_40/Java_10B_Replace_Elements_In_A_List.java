package java_15A_collections_programs_40;

import java.util.ArrayList;

public class Java_10B_Replace_Elements_In_A_List {

	public static void main(String[] args) {

		try {

			ArrayList<String> a = new ArrayList<>();

			a.add("A");
			a.add("B");
			a.add("C");
			a.add("D");

			// Setting the element at the 6 th index which
			// does not exist in our input list object
			a.set(6);

			System.out.println(a);
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			System.out.println(e);
		}
	}
}